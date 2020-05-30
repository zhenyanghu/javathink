package bio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

/**
 * @Author: Rocky
 * @Date: 2020/5/19
 * @Description:
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        // 绑定监听端口
        serverSocket.bind(new InetSocketAddress(10001));
        System.out.println("Server start...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端已连接：" + socket);
            new Thread(new ServerTask(socket)).start();
        }
    }

    private static class ServerTask implements Runnable {

        private Socket socket;

        public ServerTask(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                 ObjectOutputStream OutputStream = new ObjectOutputStream(socket.getOutputStream())){
                String username = inputStream.readUTF();
                System.out.println("Accept client message: " + username);

                OutputStream.writeUTF("Hello, " + username);
                OutputStream.flush();

            } catch (Exception e) {

            } finally {
                if (Objects.nonNull(socket)) {
                    try {
                        socket.close();
                    } catch (IOException ex) {

                    }
                }
            }
        }
    }

}
