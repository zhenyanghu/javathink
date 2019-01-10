package othertest;

/**
 * Created by Rocky on 2018/3/27.
 */
public class Test06 {
    public static void main(String[] args) {
        T t = new T();
        t.test();
        System.out.println(t.test());
        String s1 = "abcd";
        String s2 = "ab" + "cd";
        System.out.println(s1 == s2);
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6};
        f(arr);
    }
    public static void f(int[] nums) {
        if(nums.length == 0)
            return;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println(nums[i]);
            }
        }
    }
}

class T {
    static int i;
    int test() {
       i++;
       return i;
    }

}