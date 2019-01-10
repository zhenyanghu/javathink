package thinkinjava.chapter05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayDemo {

	public static void main(String[] args) {
		Integer[] a;
		Random rand = new Random(46);
		a = new Integer[rand.nextInt(20)];
		/*
		 * Arrays.toString(int[] a);
		 * 返回指定数组内容的字符串表示形式
		 */
		System.out.println(Arrays.toString(a));//字符串[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		if(list instanceof List) {
			
		}
		System.out.println(list);//List  [1, 1, 1, 1]
		
		 int[] b = {1, 2, 3, 4, };
		 System.out.println(b.length);
		 for(int i=0; i<b.length-1; i++) {
			 System.out.println(b[i]);
		 }
		 System.out.println(Arrays.toString(b));
	}
}
