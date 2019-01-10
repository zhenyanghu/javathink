package othertest;

import java.util.ArrayList;

/**
 * Created by Rocky on 2018/3/27.
 */
public class TestLianYi {
    public static void main(String[] args) {
        String s = "abc";
        s += "def";
        System.out.println(s);
        ArrayList list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<Object> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList();
        list3.add(new Integer(10).toString());
        list3.add("3");
        System.out.println(list3);
        list.add(new TestLianYi());
    }
}
