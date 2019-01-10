package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test11 {

	/**
	 * 在泛型为Integer的list中放一个String类型的对象
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		//Method method = list.getClass().getMethod("add", String.class);
		Method method = list.getClass().getMethod("add", Object.class);//不能为String
		method.invoke(list, "我是字符串");
		System.out.println(list.get(2)); 
	}
}
