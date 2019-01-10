package thinkinjava.chapter10;

/**
 * Created by Rocky on 2017/10/11.
 */
public class Exercise18 {
    private String name;
    private static int id;

    public Exercise18() {
        name = "张三";
        id = 1;
    }

    static class A {
        private String address;
        public A(String address) {
            this.address = address;
        }
        public static void main(String[] args) {
            //A a = new A();
            Exercise18 exercise18 = new Exercise18();
            //System.out.println(name);//不能直接访问外围类的非静态的对象
            System.out.println(id);
        }
    }

    public static void main(String[] args) {
        A a = new A("广州");
        System.out.println(a.address);
    }
}
