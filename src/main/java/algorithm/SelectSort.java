package algorithm;

import java.util.Arrays;

/**
 * Created by Rocky on 2019/3/23.
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 9, 1, 6, 8, 7, 3, 0, 5};
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    int temp = arr[minPos];
                    arr[minPos] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("结果：" + Arrays.toString(arr));

    }

}
