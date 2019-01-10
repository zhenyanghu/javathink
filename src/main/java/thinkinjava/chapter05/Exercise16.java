package thinkinjava.chapter05;

import java.util.Arrays;

public class Exercise16 {

	public static void main(String[] args) {
		Computer[] computers = new Computer[]{
				new Computer("拯救者"),
				new Computer("游侠"),
		};	
		System.out.println(Arrays.toString(computers));
	}
	
}

class Computer {
	private String name;
	Computer() {
		                                                        
	}
	Computer(String name) {
		 System.out.println("Computer("+name+")");
	}

}