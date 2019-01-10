package thinkinjava.chapter15;

import java.util.ArrayList;

/**
 * Created by Rocky on 2017/9/15.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Holder2<Phone> h2 = new Holder2<>(new Phone("hehe"));
        h2.add(new Phone("1"));
        h2.add(new Phone("2"));
        System.out.println(h2);
        System.out.println("30818902818100f34d52b7fb481752a506905e5b8a0698994dc3104fc8f7d1180912c6087dee594225d4ba1946dfad58598859d3501e59fc9cbd86b50c79b2ce09630fed4896651b54c37ae98855545c1434f9f4a15e3a15e9b09997b03af16c7465f816bfe2b1a49821a0090e283f82ebf2ed7daa2e76a5ada469a14e78108dde58ac13b826fb0203010001".length());
    }
}

class Holder2<E> extends ArrayList<E> {
    private E e;
    public Holder2(E e) {
        this.e = e;
        this.add(e);
    }
}
