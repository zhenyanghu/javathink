package bio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @Author: Rocky
 * @Date: 2020/5/19
 * @Description:
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        // 服务器的通讯地址
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 10001);

        ObjectInputStream inputStream = null;
        ObjectOutputStream outputStream = null;
        try {
            socket = new Socket();
            // 链接服务器
            socket.connect(address);

            // 注意：顺序不能反，开始写反了，一直等待输入，程序阻塞
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            inputStream = new ObjectInputStream(socket.getInputStream());

            outputStream.writeUTF("Rocky");
            // 注意：write只是写入到缓存区，flush将缓冲区的数据发送到目标机器
            outputStream.flush();

            System.out.println("接收服务器消息：" + inputStream.readUTF());

        } finally {
            if (socket!=null) socket.close();
            if (outputStream!=null) outputStream.close();
            if (inputStream!=null) inputStream.close();

        }

    }
}
