package thinkinjava.chapter11;

import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {

	public static void main(String[] args) {
		//Collection<Integer> c = new ArrayList<Integer>();
		//Set<Integer> c = new HashSet<Integer>();
		Collection<Integer> c = new HashSet<Integer>();
		for(int i=0; i<10; i++){
			c.add(i);
			c.add(i);
		}
		for(Integer i :c) {
			System.out.print(i+" ");
		}
	}
}
