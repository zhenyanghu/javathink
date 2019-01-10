package thinkinjava.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rocky on 2017/8/7.
 * 就是写注释的时候比较操蛋
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
//        list.remove(list.get(0));
/*        int i = list.indexOf("two");
        int a = list.indexOf(list.get(2));
        System.out.println(a);
        System.out.print(i);
        System.out.println(list);
        List<String> list1 = list.subList(0,1);
        System.out.println(list1);
        Exercise7 dog = new Exercise7();*/
        list.add("one");
        System.out.println(list);
        System.out.println(list.indexOf("one"));
//        boolean b = list.remove("one");
//        System.out.println(b+"  "+list);
        list.add(1,"2");
        System.out.println(list);
        List<String> list3 = list.subList(3, 5);
        System.out.println(list3);
//        list3.remove(list3.get(0));
//        System.out.println(list);
//        System.out.println(list.retainAll(list3));
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        String str = list.set(1,"1");
//        System.out.println(list);
//        System.out.println(str);
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.isEmpty());
        System.out.println(list);
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
        String[] strings = list.toArray(new String[2]);
        System.out.println(strings);
        System.out.println(Arrays.toString(strings));
    }
}

