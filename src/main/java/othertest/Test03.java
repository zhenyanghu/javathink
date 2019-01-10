package othertest;

/**
 * Created by Rocky on 2017/12/25.
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{0,2,0,1}));
    }
    public static int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i=1; i<nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        boolean flag = true;
        for(int i=0; i<nums.length; i++) {
            if(i != index) {
                if (max >= 2 * nums[i]) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            return index;
        }
        return -1;
    }

}
