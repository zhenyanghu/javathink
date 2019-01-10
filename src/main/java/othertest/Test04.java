package othertest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rocky on 2018/3/15.
 */
public class Test04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        method(a, b);
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        Map map = new HashMap();
        map.put(null, "abc");
        List list = new ArrayList();
        list.add(true);

        System.out.println(list);
    }
    public static void method(int a, int b) {
       System.out.println("a=100");
       System.out.println("b=200");
       System.exit(0);
    }
}
