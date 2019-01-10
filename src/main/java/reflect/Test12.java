package reflect;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test12 {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4};
		Class<?> clazz = arr.getClass().getComponentType();
		System.out.println(clazz.getName());
		System.out.println(Array.getLength(arr));//都是native方法
		System.out.println(Array.get(arr, 1));
		Array.set(arr, 0, 23);
		System.out.println(Arrays.toString(arr));
		
	}
}
