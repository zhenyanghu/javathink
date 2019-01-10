package thinkinjava.chapter04;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("请输入一个正整数：");
		 int a = scan.nextInt();
		 int result = f(a);
		 System.out.println("斐波那契数为："+result);
	}
	
	public static int f(int n) {
		if(n < 3) {
			return 1;
		} else {
			return f(n-2)+f(n-1);  
		}		
	}
}
