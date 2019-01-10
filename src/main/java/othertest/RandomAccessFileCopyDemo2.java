package othertest;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Rocky on 2018/3/15.
 */
public class RandomAccessFileCopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("05_jdbc.zip", "r");
        RandomAccessFile desc = new RandomAccessFile("copy.zip", "rw");
        byte[] data = new byte[1000];
        int len = -1;
        while ((len = src.read(data)) != -1) {
            desc.write(data);
        }
        src.close();
        desc.close();
    }
}
