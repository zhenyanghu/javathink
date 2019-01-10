package thinkinjava.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rocky on 2017/8/8.
 */
public class Exercise7 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog("one"), new Dog("two"), new Dog("three"), new Dog("four"), new Dog("five")};
        List<Dog> list = Arrays.asList(dogs);
        System.out.println(list);
        List<String> aa = new ArrayList<String>();
        
    }
}

class Dog {
    private String name;
    public Dog() {

    }
    public Dog(String name) {
        this.name = name;
    }

    public String toString() {
        return "Dog["+name+"]";
    }
}
