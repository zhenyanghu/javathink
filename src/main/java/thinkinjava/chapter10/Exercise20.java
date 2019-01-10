package thinkinjava.chapter10;

/**
 * Created by Rocky on 2017/10/11.
 */
public interface Exercise20 {
    public void f();
    static class A implements Exercise20 {
        public void f() {
            System.out.println("override f()");
        }

        public static void main(String[] args) {
            A a = new A();
            a.f();
        }
    }
}
