package thinkinjava.chapter15;

import thinkinjava.util.Generator;

import java.util.*;

public class Generators {

	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;		
	}
	
	public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			list.add(gen.next());
		return list;
	}
	
	public static <T> List<T> fill(LinkedList<T> list, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			list.add(gen.next());
		return list;
	}
	
	public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			set.add(gen.next());
		return set;
	}
	
	public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			queue.add(gen.next());
		return queue;
	}
	
	public static void main(String[] args) {
		List<Coffee> coffee = fill(new LinkedList<Coffee>(), new CoffeeGenerator(), 4);
		for (Coffee c : coffee) {
			System.out.println(c);
		}
		List<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 18);
		for (Integer i : fnumbers) {
			System.out.print(i + " ");
		}
	}
}
