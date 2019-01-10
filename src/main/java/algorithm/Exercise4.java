package algorithm;

import java.util.Scanner;

/**
 * Created by Rocky on 2017/8/15.
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入两个正整数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = f(a, b);
        System.out.println("最小公倍数："+a*b/c);
        System.out.println("最小公约数："+c);
    }
    public static int f(int m, int n) {
        for (;;) {
            if ((m = m % n) == 0)
                return n;
            if ((n = n % m) == 0)
                return m;
        }
    }
}
