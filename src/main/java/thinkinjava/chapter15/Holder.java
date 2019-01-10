package thinkinjava.chapter15;

/**
 * Created by Rocky on 2017/9/15.
 */
public class Holder<T> {
    private T t;
    public Holder(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Holder<Phone> h = new Holder<>(new Phone());
        System.out.println(h.get());
        Holder<Computer> h2 = new Holder<>(new Computer());
        System.out.println(h2.getClass().getSimpleName());
    }
}

class Phone {
    private String name;
    public Phone() {

    }
    public Phone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Computer {}