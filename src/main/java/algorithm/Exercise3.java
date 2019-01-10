package algorithm;

import java.util.Scanner;

/**
 * Created by Rocky on 2017/8/15.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Exercise3 e = new Exercise3();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = scan.nextInt();
        e.split(n);
    }
    public void split(int n) {
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i+"*");
                split(n/i);
            }
        }
        System.out.println(n);
        System.exit(0);
    }
}
