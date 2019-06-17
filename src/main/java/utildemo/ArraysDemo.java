package utildemo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Rocky
 * @Date: 2019-06-16
 * @Description:
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        List list1 = Arrays.asList(arr1);
        System.out.println(list1.size());

        String[] arr2 = {"欢迎", "关注", "java"};
        List<String> list2 = Arrays.asList(arr2);
        System.out.println(list2.size());
//        arr2[1] = "爱上";
//        arr2[2] = "我";
        list2.set(1, "爱上");
        list2.set(2, "我");
        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);
    }
}

