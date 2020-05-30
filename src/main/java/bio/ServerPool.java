package bio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: Rocky
 * @Date: 2020/5/19
 * @Description:
 */
public class ServerPool {

    private static ExecutorService threadPool = Executors.newFixedThreadPool(100);

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("127.0.0.1", 10001));
        System.out.println("Server start...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端已连接：" +socket);
            threadPool.execute(new ServerTask(socket));
        }
    }

    private static class ServerTask implements Runnable {

        private Socket socket;

        public ServerTask(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                 ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
                String username = in.readUTF();
                System.out.println("收到客户端的消息：" + username);

                out.writeUTF("Hello, " + username);
                out.flush();

            } catch (Exception e) {

            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
