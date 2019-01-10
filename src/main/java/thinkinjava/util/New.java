package thinkinjava.util;

import java.util.*;

public class New {

	public static <K, V> Map<K, V> map() {
		return new HashMap<K, V>();
	}
	
	public static <T> List<T> list() {
		return new ArrayList<T>();
	}
	
	public static <T> Set<T> set() {
		return new HashSet<T>();
	}
	
	public static <T> Queue<T> queue() {
		return new LinkedList<T>();
	}
	
	public static void main(String[] args) {
		Map<String, List<String>> map = New.map();
		List<String> lts = New.list();
		Set<String> ss = New.set();
		Queue<String> qs = New.queue();
	}
}
