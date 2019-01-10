package thinkinjava.chapter10;

/**
 * Created by Rocky on 2017/10/11.
 * 接口内部类
 */
public interface ClassInterface {
    void howdy();
    //接口内部类实现外围类
    class Test implements ClassInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
