package othertest;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Rocky on 2018/3/15.
 */
public class Client {
    private Socket socket;
    public Client() {
        try {
            //在构造方法中初始化socket
            socket = new Socket("localhost", 8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start() {
        try {
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.start();

            Scanner scan = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
            PrintWriter pw = new PrintWriter(osw, true);
            String message = null;
            while (true) {
                message = scan.nextLine();
                pw.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    class ServerHandler implements Runnable{
        public void run(){
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                String message = null;
                while((message = br.readLine())!=null){
                    System.out.println(message);
                }
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
