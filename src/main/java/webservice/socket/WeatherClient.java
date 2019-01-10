package webservice.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by Rocky on 2017/9/25.
 */
public class WeatherClient {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象，和服务器建立连接， 两个参数分别是，主机名，端口号
        Socket socket = new Socket("127.0.0.1",12345);

        //2.发送城市得名字
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("北京");
        System.out.println("请求查询天气：北京");

        //3.接收返回结构，使用输入流
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String result = dis.readUTF();
        System.out.println("北京的天气：" + result);

        //4.关闭流
        dos.close();
        dis.close();
    }
}
