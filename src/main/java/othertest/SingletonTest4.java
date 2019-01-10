package othertest;

/**
 * Created by Rocky on 2017/9/4.
 */
public class SingletonTest4 {
    //1.定义一个私有构造方法
    private SingletonTest4() {}
    //2.定义一个静态私有变量(不初始化，不使用final关键字，使用volatile保证了多线程访问时instance变量的可见性，避免了instance初始化时其他变量属性还没赋值完时，被另外线程调用)
    private static volatile SingletonTest4 instance;
    //定义一个共有的静态方法，返回该类型实例
    public static SingletonTest4 getInstance() {
        if (instance == null) {
            synchronized (SingletonTest4.class) {
                if (instance == null)
                    instance = new SingletonTest4();
            }
        }
        return instance;
    }
}
