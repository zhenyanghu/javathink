package thinkinjava.chapter07;

import java.util.Random;

public class Exercise16 {
	
	private static final int AAA = 1;
	private final int a;
	private String name;
	private static Random random = new Random(47);
	private final int i4 = random.nextInt(20); 
	private static final int INT_5 = random.nextInt(20);
	//private static final int VAL_1 = random.nextInt(20);
	
	public Exercise16(String name) {
		a = 2; //即使不用也必须得赋值
		this.name = name;
		System.out.println("初始化"+name);
	}
	
	public String toString() {
		return "name:" + name + "   i4:" + i4 + "   INT_5:" + INT_5;
	}
	
	public static void main(String[] args) {
		Frog a = new Frog();
		a.crawl();
		a.eat();
		//Random random = new Random(47);
		for(int i=0; i<10; i++) {
			//System.out.print(random.nextInt(20)+" ");
		}
	/*	System.out.println(VAL);
		System.out.println("???");
		System.out.println(VAL_1);
		System.out.println(i4);*/
		Exercise16 e = new Exercise16("第一个");
		System.out.println(e);
		Exercise16 e2 = new Exercise16("第二个");
		System.out.println(e2);
	}
}

class Amphibian {
	public void crawl() {
		System.out.println("爬行");
	}
	public void eat() {
		System.out.println("吃东西");
	}
}

class Frog extends Amphibian {
	/*public void crawl() {
		System.out.println("我是青蛙，我除了爬，还可以跳！");
	}*/
}

