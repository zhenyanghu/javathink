package othertest;

import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * Created by Rocky on 2018/3/14.
 */
public class RandomAccessFileCopyDemo1 {
    public static void main(String[] args) throws IOException {
//        String str = "代码整洁之道";
//        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
//        byte[] stringData = str.getBytes("utf-8");
//        raf.write(stringData);
//        raf.close();
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "r");
        byte[] data = new byte[100];
        int len = raf.read(data);
        String str = new String(data, 0, len, "utf-8");
        System.out.println(str);
        raf.close();
    }
}
