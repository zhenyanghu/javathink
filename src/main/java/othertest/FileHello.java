package othertest;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Rocky on 2018/4/2.
 */
public class FileHello {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("G:/hello.txt");
        byte[] data = new byte[10];
//        int len = fis.read(data);
//        String str = new String(data, 0 , len);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:/hello.txt"));
//        int len = bis.read(data);
//        String str = new String(data, 0 , len);
        int len = -1;
        StringBuilder sb = new StringBuilder();
        while ((len = bis.read(data)) != -1) {
           String strData = new String(data, 0, len);
            sb.append(strData);
        }
        String str = sb.toString();
        int count = 0;
        System.out.println(str);
        for (int i = 0; i < str.length() - "hello".length(); i++) {
            String subStr = str.substring(i, i + "hello".length());
            if ("hello".equals(subStr)) {
                count++;
            }
        }
        System.out.println("hello出现的次数" + count);
    }
}
