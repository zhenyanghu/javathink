package leetcode;

/**
 * Created by Rocky on 2018/2/7.
 */
public class Exercise026 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,1,2,0}));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}
