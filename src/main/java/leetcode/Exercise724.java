package leetcode;

/**
 * Created by Rocky on 2018/1/3.
 */
public class Exercise724 {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-1,-1,0,1,1,0}));
    }

    public static int pivotIndex(int[] nums) {
        if(nums.length < 3) {
            return -1;
        }
        for(int i=0; i<nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for(int j=0; j<i; j++) {
                leftSum += nums[j];
            }
            for(int k=i+1; k<nums.length; k++) {
                rightSum += nums[k];
            }
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
