package thinkinjava.chapter11.exercise15;

import java.util.Arrays;

/**
 * Created by Rocky on 2017/8/13.
 */
public class Exercise15 {
    public static void main(String[] args) {
        String string = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s";
        char[] strArr = string.toCharArray();
        System.out.println(Arrays.toString(strArr));
        Stact<Character> stact = new Stact<Character>();
        for (int i=0; i<strArr.length; i++) {
            if (strArr[i] == '+') {
                stact.push(strArr[i + 1]);
            } else if (strArr[i] == '-'){
                System.out.println(stact.pop());
            }
        }
        System.out.println(stact);
    }
}
