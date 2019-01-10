package algorithm;

/**
 * Created by Rocky on 2017/8/15.
 */
public class Exercise2 {
    public static void main(String[] args) {
        for (int n=100; n<=1000; n++) {
            int a = n % 100 % 10;
            int b = n % 100 / 10;
            int c = n / 100;
            if ( a*a*a + b*b*b +c*c*c == n) {
                System.out.print(n+" ");
            }
        }

    }
}
