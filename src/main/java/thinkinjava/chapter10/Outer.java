package thinkinjava.chapter10;

/**
 * Created by Rocky on 2017/9/17.
 */
public class Outer {
    private String name;
    public Outer() {}
    public Outer(String name) {
        this.name = name;
    }
    class Inner {
        public String toString() {
            return "name:" + name + ";";
        }

    }
    //非静态的方法中可以直接创建非静态类的对象
    public  Inner getInnerInstance() {
        return new Inner();
    }
    public void test() {
        Inner i = new Inner();
        System.out.println(i);
    }

    public static void main(String[] args) {

        Outer o = new Outer();
        o.test();
        Inner i = o.getInnerInstance();
        Inner io = o.getInnerInstance();
        System.out.println(i);
        System.out.println(io);
        System.out.println("====================");
        //不能这样这样创建对象：静态的方法中不能创建非静态的类的对象，只能创建静态类的对象
        //Inner inner = new Inner();
        System.out.println("-------练习三-----");
        Outer o1 = new Outer("赵云");
        Inner i1 = o1.getInnerInstance();
        System.out.println(i1);
        System.out.println("--------又一个-------");
        Inner inner = o1.new Inner();//.new的语法，告诉某个对象，去创建其某个内部类的对象
    }
}

class Other {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}

