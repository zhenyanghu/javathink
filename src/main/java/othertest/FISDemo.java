package othertest;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Rocky on 2018/3/16.
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis
                = new FileInputStream(
                "raf.txt"
        );
        byte[] data = new byte[10];
        int len = -1;
        while ((len = fis.read(data)) != -1) {
            String str = new String(
                    data,0,len,"UTF-8"
            );
            System.out.print(str);
        }
        fis.close();
    }
}
