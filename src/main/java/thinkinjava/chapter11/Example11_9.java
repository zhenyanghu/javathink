package thinkinjava.chapter11;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Rocky on 2017/8/13.
 */
public class Example11_9 {
    public static void main(String[] args) {
        //Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set = new TreeSet<Integer>();
        Random random = new Random(47);
        for (int i=0; i<10000; i++) {
            Integer a = random.nextInt(40);
            //System.out.println(a);
            set.add(a);
        }
        System.out.println(set);

    }
}
