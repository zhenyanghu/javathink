package thinkinjava.chapter15;

public class LinkedStack<T> {

	private static class Node<U> {
		U item;
		Node<U> next;
		Node() {	//构造方法不加泛型
			item = null;
			next = null; 
		}
		Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}
		boolean end() { //结束，没有元素了
			return item == null && next == null;
		}
		
	}
	
	private Node<T> top = new Node<T>();//末端哨兵
	
	public void push(T item) {
		top = new Node<T>(item, top);
	}
	
	public T peek() {
		T result = top.item;
		return result;
	}
	
	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		LinkedStack<String> ls = new LinkedStack<String>();
		for (String string : "ni hao a ni jiao shen me?".split(" ")) {
			ls.push(string);
		}
		String str;
		while ((str = ls.pop()) != null) {
			System.out.println(str);
		}
	}
}
