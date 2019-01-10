package thinkinjava.chapter15;

import net.mindview.util.Sets;

import java.lang.reflect.Method;
import java.util.*;

/**
 * 第11章的总结
 * @author Rocky
 *
 */
public class ContainerMethodDifferences {

	static Set<String> methodSet(Class<?> clazz) {
		Set<String> result = new TreeSet<String>();
		for (Method m : clazz.getMethods()) {
			result.add(m.getName());
		}
		return result;
	}
	
	static void interfaces(Class<?> clazz) {
		System.out.println("interfaces in " + clazz.getSimpleName() + ": ");
		List<String> result = new ArrayList<String>();
		for (Class<?> c : clazz.getInterfaces()) {
			result.add(c.getSimpleName());
		}
		System.out.println(result);
	}
	
	static Set<String> object = methodSet(Object.class);//Object类中所有的方法名
	
	static {
		object.add("clone");
	}
	
	static void difference(Class<?> superset, Class<?> subset) {
		System.out.println(superset.getSimpleName() + " extends " + subset.getSimpleName() + " adds: ");
//		System.out.println(methodSet(superset));
//		System.out.println(methodSet(subset));
 		Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
		comp.removeAll(object);
		System.out.println(comp);
		interfaces(superset);
	}
	
	public static void main(String[] args) {
		System.out.println("Collection method: " + methodSet(Collection.class));
		interfaces(Collection.class);
		difference(Set.class, Collection.class);//[] set和collection中的方法名相同
		difference(HashSet.class, Set.class);
		difference(LinkedHashSet.class, HashSet.class);
		difference(TreeSet.class, Set.class);
		difference(List.class, Collection.class);
		difference(ArrayList.class, List.class);
		difference(LinkedList.class, List.class);
		difference(Queue.class, List.class);
		difference(PriorityQueue.class, Queue.class);
		System.out.println("==========================");
		System.out.println("Map: " + methodSet(Map.class));
		difference(HashMap.class, Map.class);
		difference(LinkedHashMap.class, HashMap.class);
		difference(SortedMap.class, Map.class);
		difference(TreeSet.class, Map.class);
	}
}
