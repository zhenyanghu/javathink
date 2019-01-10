package thinkinjava.chapter05;

public class Tree {

	Tree(){
		System.out.println("我是一棵树");
	}
	
	Tree(int i) {
		System.out.println("我是一棵高为："+i+"米的树");
	}
	public static void main(String[] args) {
		Tree tree = new Tree(12);
		Tree tree2 = new Tree();
	}
}
