package othertest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rocky on 2017/8/17.
 */
public class Test01 {
    public static void main(String[] args) {
        Integer obj = new Integer(100);
        System.out.println(obj.toString());
        String str = String.valueOf(obj);
        System.out.println(str);
        Object object = null;
//        System.out.println(String.valueOf(object));
//        System.out.println(String.valueOf(object) instanceof String);
        //Math.max();
        String string = String.valueOf(object);
        System.out.println("object是字符串null了："+string);
        string = null;
        if (null != string && !"".equals(string)) {
            System.out.println("stirng不为空");
        }
        int[] result = (int[])null;
        System.out.println("这个：" +result);
        List<String> names = new ArrayList<String>() {
            {
               /* for (int i = 0; i < 10; i++) {
                    add("A" + i);
                }*/
                add("A");
                add("B");
            }
        };
        System.out.println(names.toString());
    }
}
