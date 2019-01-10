package thinkinjava.chapter14;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by Rocky on 2017/8/27.
 */
public class Exercise9 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("thinkinjava.chapter14.C1");
            f1(c);
//            Class ca = Class.forName("A1");
//            Field[] fields = ca.getDeclaredFields();
//            System.out.println(fields.length);
//            for (int i=0; i<fields.length; i++) {
//                int i1 = fields[i].getModifiers();
//            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void f1(Object obj) {
        if (obj instanceof Class) {
            Class clazz = (Class) obj;
            Field[] fields = clazz.getDeclaredFields();
            System.out.println(Arrays.toString(fields));
            for (Field field : fields) {
                System.out.println(field);
            }
            Class supClass = clazz.getSuperclass();
            f1(supClass);
        }
    }
}

class A1 {
    private String name;
    private int age;
}

class B1 extends A1 {}

class C1 extends B1 {}

