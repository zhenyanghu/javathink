package thinkinjava.chapter11;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		//list.add(5);//list的底层仍然表示的是数组
		System.out.println(list);
		int[] arr = {1,2,3};
		System.out.println(arr.toString());
		System.out.println(Arrays.toString(arr));
	}
}
