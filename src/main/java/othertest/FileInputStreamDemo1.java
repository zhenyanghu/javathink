package othertest;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Rocky on 2018/3/15.
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //不能创建文件
        FileInputStream fis = new FileInputStream("hzy.txt");
        System.out.println("创建成功");
        fis.close();
    }
}
