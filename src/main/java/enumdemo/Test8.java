package enumdemo;

import java.util.Arrays;

public class Test8 {

	public static void main(String[] args) {
		Day[] days = Day.values();
		System.out.println(Arrays.toString(days));
		
		Day day = Day.valueOf("MONDAY");
		System.out.println(day);
		if (day instanceof Day) {
			System.out.println("-----");
		}
		
		Day d1 = Day.MONDAY;
		Day[] ds = d1.values();
		Enum d2 = Day.MONDAY;
//		d2.values();
		System.out.println(Arrays.toString(ds));
		
		Test8 t = new Test8();
		t.f();
		
		Class<?> clazz = d2.getDeclaringClass();
		if (clazz.isEnum()) {
			Day[] days1 = (Day[]) clazz.getEnumConstants();
			System.out.println(Arrays.toString(days1));
		}
	}
	
	public static void f() {
		System.out.println("我是一个静态方法");
	}
}
