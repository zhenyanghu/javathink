package thinkinjava.chapter12;

/**
 * Created by Rocky on 2017/8/20.
 */
public class IntegerMatch {
    public static void main(String[] args) {
        /*
            有或者没有负号，一个或多个数字
         */
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("4567".matches("-?\\d+"));
        System.out.println("+789".matches("-?\\d+"));
        System.out.println("+789".matches("(-|\\+)?\\d+"));

    }
}
