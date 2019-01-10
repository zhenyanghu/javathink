package othertest;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rocky on 2018/3/15.
 */
public class Server {
    private ServerSocket serverSocket;
    private List<PrintWriter> allOut;
    public Server() {
        try {
            allOut = new ArrayList<>();
            serverSocket = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 将给定的输出流存入共享集合
     * @param out
     */
    private synchronized void addOut(PrintWriter out){
        allOut.add(out);
    }
    /**
     * 将给定的输出流从共享集合中删除
     * @param out
     */
    private synchronized void removeOut(PrintWriter out){
        allOut.remove(out);
    }
    /**
     * 将给定的消息发送给所有客户端
     * @param message
     */
    private synchronized void sendMessage(String message){
        for(PrintWriter out : allOut){
            out.println(message);
        }
    }
    public void start() {
        try {
            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler handler = new ClientHandler(socket);
                Thread t1 = new Thread(handler);
                t1.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class ClientHandler implements Runnable {
        //当前线程与指定的客户端交互的socket
        private Socket socket;
        //客户端的地址信息
        private String host;
        public ClientHandler(Socket socket) {
            this.socket = socket;
            InetAddress address = socket.getInetAddress();
            host = address.getHostAddress();
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
                addOut(pw);
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String message = null;
                while ((message = br.readLine()) != null) {
                    sendMessage(host + "说" + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //客户端与服务端断开连接.
                //客户端下线后从共享集合删除输出流
                removeOut(pw);
                sendMessage(host+"下线了!");
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
