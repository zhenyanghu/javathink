package othertest;

/**
 * Created by Rocky on 2018/3/26.
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    public static int f(int n) {
        if (n == 1)
            return 1;
        else
            return n * f(n - 1);
    }
}
