package othertest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Rocky on 2017/12/18.
 */
public class TestException {
    public static void main(String[] args) throws Exception {
        TestException te = new TestException();
        te.test();
    }

    public void test() throws Exception {
        try {
            InputStream is = new FileInputStream(new File("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
