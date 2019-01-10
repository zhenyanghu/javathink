package thinkinjava.chapter14;

/**
 * Created by Rocky on 2017/8/27.
 */
public class Exercise8 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("thinkinjava.chapter14.C");
            f(c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void f(Object obj) {
        if (obj instanceof Class) {
            Class clazz = (Class) obj;
            System.out.println(clazz.getName());
            Class supClass = clazz.getSuperclass();
            f(supClass);
        }
    }
}

class A {}

class B extends A {}

class C extends B {}

