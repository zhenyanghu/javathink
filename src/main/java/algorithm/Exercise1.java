package algorithm;

/**
 * Created by Rocky on 2017/8/15.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int count = 0;
        for (int n=101; n<201; n++) {
            boolean flag = false;
            for(int i=2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = true;//非素数
                    break;
                }
            }
            if (!flag) {
                count++;
                System.out.print(n+" ");
            }
        }
        System.out.println();
        System.out.println("素数共 "+count+" 个");
    }
}
