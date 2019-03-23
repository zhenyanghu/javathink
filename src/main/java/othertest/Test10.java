package othertest;

/**
 * Created by Rocky on 2019/2/27.
 */
public class Test10 {

    private String aname;

    private class Inner {

        private String bname;

        private void f() {
            System.out.println(Test10.this);
        }

    }

    public static void main(String[] args) {
//        Test10.Inner inner = new Test10.Inner();

        Test10 t = new Test10();
        Inner inner = t.new Inner();
        inner.f();
    }
}
