package leetcode;

import java.util.Scanner;

/**
 * Created by Rocky on 2017/9/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getResult(s);
    }

    public static void getResult(String s) {
        int start = 1;
        while (s.length() > 0) {
            int endEmbrace = s.indexOf(")");
            if (endEmbrace < 0)
                break;
            start = start * endEmbrace;
            s = getString(s, endEmbrace);
        }
        System.out.println(start);
    }

    public static String getString(String s, int endEmbrace) {
        if (s.length() <= 2) {
            return "";
        } else {
            char[] temp = new char[s.length() - 1];
            int count = 0;
            for (int i = 1; i < s.length(); i++) {
                if (i != endEmbrace) {
                    temp[count] = s.charAt(i);
                    count++;
                }
            }
            return String.valueOf(temp);
        }
    }

}
