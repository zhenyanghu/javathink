package thinkinjava.chapter04;

import java.util.Random;

public class Exercise8 {

	private static final int _1 = 1;
	private static final int _5 = 5;

	public static void main(String[] args) {
		Random ran = new Random();
		for(int i=0; i<_5; i++) {
			int a = ran.nextInt(5);
			switch (a) {
			case 0:
				System.out.println("我是0");
				break;
			case _1:
				System.out.println("我是1");
				break;
			case 2:
				System.out.println("我是2");
				break;
			case 3:
				System.out.println("我是3");
				break;
			default:
				System.out.println("我是4");
				break;
			}
			
		}
	}
}
