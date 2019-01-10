package othertest;

import java.util.LinkedList;

/**
 * Created by Rocky on 2017/9/5.
 */
public class TestProtected {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int age = solution.age;
        System.out.println("protected同包类中也是可以访问的："+age);
        LinkedList<String> list = new LinkedList<>();
    }
}
