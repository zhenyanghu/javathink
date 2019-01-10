package othertest;

import java.util.Arrays;

/**
 * Created by Rocky on 2017/12/25.
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(Solution1.dominantIndex(new int[]{6, 2, 1, 0}));
    }
}

class Solution1 {
    public static int dominantIndex(int[] nums) {
        for(int i=0; i<nums.length-1; i++) { // 一次遍历只能找到最大的
            if(nums[i] > nums[i+1]) {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        if(nums.length >= 2) {
            if(nums[nums.length-1] > 2*nums[nums.length-2]) {
                return nums[nums.length-1];
            }
        }
        return -1;
    }
}
