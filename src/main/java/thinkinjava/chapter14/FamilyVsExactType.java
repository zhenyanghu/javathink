package thinkinjava.chapter14;

/**
 * Created by Rocky on 2017/9/11.
 */
public class FamilyVsExactType {

    static void test(Object x) {
        System.out.println("Testing x of type: " + x.getClass());//class Base     class Derived
        System.out.println("x instanceof Base: " + (x instanceof Base));//true      true
        System.out.println("x instanceof Derived: " + (x instanceof Derived));//false      true
        System.out.println("Base.isInstance(x): " + Base.class.isInstance(x));//true       true
        System.out.println("Derived.isInstance(x): " + Derived.class.isInstance(x));//false     true
        System.out.println("-------------------");
        System.out.println(x.getClass().hashCode());
        System.out.println(Base.class.hashCode());
        System.out.println(x.getClass().toString());
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        test(new Base());
        //test(new Derived());

        //System.out.println(Base.class);
    }
}

class Base {}

class Derived extends Base {}
