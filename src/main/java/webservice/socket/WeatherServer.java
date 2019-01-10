package webservice.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Rocky on 2017/9/25.
 */
public class WeatherServer {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象， 指定端口号
        ServerSocket serverSocket = new ServerSocket(12345);

        while (true) {

            //2.等待客户端的连接，accept()是一个阻塞方法
            //注意：匿名内部类中访问外部成员，必须是final的
            final Socket socket = serverSocket.accept();

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        //3.使用输入流接收客户端发送过来的请求
                        DataInputStream dis = new DataInputStream(socket.getInputStream());
                        String cityName =  dis.readUTF();
                        System.out.println("接收客户端发送的请求：" + cityName);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 4.根据城市名查询天气
                        String result = "今天天气很热";
                        System.out.println("返回天气信息：" +result);
                        //5.输出流 返回查询结果
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                        dos.writeUTF(result);

                        //关闭流
                        dis.close();
                        dos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };

            //启动线程
            new Thread(runnable).start();
        }
    }
}
