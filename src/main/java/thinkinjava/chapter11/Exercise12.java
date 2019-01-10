package thinkinjava.chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Rocky on 2017/8/12.
 */
public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);list1.add(6);
        list2.add(11);list2.add(12);list2.add(13);list2.add(14);list2.add(15);list2.add(16);
        ListIterator<Integer> it = list1.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------1-------");
        while (it.hasPrevious()) {
            list2.add(it.previous());
            //System.out.println(it.previous());
        }
        System.out.println("---------2----------");
        System.out.println(list2);

    }
}
