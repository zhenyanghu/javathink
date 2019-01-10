package othertest;

/**
 * Created by Rocky on 2018/3/31.
 */
public class Test07 {
    public static void main(String[] args) {
        int a = 20;
        long b = 20L;
        double c = 20.0;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        //int long double 都是没有equals方法的
        //System.out.println(a.equals(b));
        int d = 3;
        System.out.println(15/3);
    }
}
