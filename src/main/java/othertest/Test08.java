package othertest;

/**
 * Created by Rocky on 2018/3/31.
 */
public class Test08 {
    private String name;
    public static void main(String[] args) {
        S s = new S();
        s.doSome();
        s.doSome(10);
        String str;
        //编译错误，局部变量是不会有默认值的
//        System.out.println(str);
        //编译错误，静态方法中不能直接访问成员变量，因为静态方法中没有隐式的this传递
        //System.out.println(name);
        System.out.println(new Test08().name);
    }
}

class F {
    public void doSome() {
        System.out.println("我做了一件事");
    }
}

class S extends F {
    public void doSome(int n) {
        System.out.println("我做了" + n + "件事");
    }
}

