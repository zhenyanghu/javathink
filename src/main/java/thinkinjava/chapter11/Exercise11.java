package thinkinjava.chapter11;

import java.util.*;

/**
 * Created by Rocky on 2017/8/10.
 */
public class Exercise11 {

    public static void display(Iterator<Dog> it) {
        while(it.hasNext()) {
            Dog dog = it.next();
            System.out.print(dog+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        for (int i=0; i<10; i++) {
            dogs.add(new Dog(""+i));
        }
        LinkedList<Dog> dogll = new LinkedList<Dog>(dogs);
        HashSet<Dog> doghs = new HashSet<Dog>(dogs);
        TreeSet<Dog> dogts = new TreeSet<Dog>(dogs);
        System.out.println(dogll);
        System.out.println(doghs);
        //System.out.println(dogts);

        display(dogs.iterator());
        display(dogll.iterator());
        display(doghs.iterator());
//        display(dogts.iterator());
     }
}
