package othertest;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by Rocky on 2018-12-18.
 */
public class Test09 {

	public static void main(String[] args) {
		// 推荐使用Objects.equals();
		System.out.println(Objects.equals(null, null));
		String str = "a,b,c,,";
		String[] ary = str.split(",");
		// 预期大于 3，结果是 3
		System.out.println(ary.length);
		
		System.out.println(Arrays.asList(1, 2, 3).getClass().getName());//
		List<Integer> list = Arrays.asList(1, 2, 3);
		List<Integer> list1 =  list.subList(1, 2);
		System.out.println(list1);
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println(list2.getClass().getName());
		List<String> list3 = new ArrayList<String>(2);
		list3.add("guan");
		list3.add("bao");
		list3.add("three");
		list3.forEach(e -> System.out.println(e));
		
		ArrayList<String> list4 = new ArrayList<>();
		list4.add("1");
		list4.add("2");
		Iterator<String> iterator = list4.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			if (Objects.equals("1", item)) {
				iterator.remove();
			}
		}
//		for (String item : list4) {
//			if ("1".equals(item)) {
//				list4.remove(item);
//			}
//		}
		System.out.println(list4);
		
		List<String> list5 = new ArrayList<>(2);
		Map<String, Object> map = new HashMap<String, Object>() {
			{
				put("one", 1);
				put("two", 2);
				put("three", 3);
			}
		};
		for (Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		// jdk8推荐使用的遍历方式
		map.forEach((key, value) -> System.out.println("key="+ key + ", value=" + value));
	}
}
