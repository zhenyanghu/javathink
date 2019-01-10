package enumdemo;

public class EnumDemo {

	public static void main(String[] args) {
		Day[] days = new Day[] {Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
		for (int i = 0; i < days.length; i++) {
			System.out.println("day[" + i + "].ordinal():" + days[i].ordinal());
		}
		
		System.out.println("----------------compareTo---------------------");
		//通过compareTo方法比较，实际上其内部是通过ordinal()值比较
		System.out.println("days[0].compareTo(days[1]):" + days[0].compareTo(days[1]));
		System.out.println("days[0].compareTo(days[2]):" + days[0].compareTo(days[2]));
		
		//获取枚举对象的Class对象引用，当然也可以通过getClass()方法
		Class<?> clazz = days[0].getDeclaringClass();
		System.out.println(clazz);

		System.out.println("---------------name()----------------------");
		//name()
		System.out.println("days[0].name(): " + days[0].name());
		System.out.println("days[1].name(): " + days[1].name());
		System.out.println("days[2].name(): " + days[2].name());
		System.out.println("days[3].name(): " + days[3].name());
		
		System.out.println("---------------toString()----------------------");
		//toString()
		System.out.println("days[0].toString(): " + days[0].toString());
		System.out.println("days[1].toString(): " + days[1].toString());
		System.out.println("days[2].toString(): " + days[2].toString());
		System.out.println("days[3].toString(): " + days[3].toString());
	
		System.out.println("-------------------------------------");
		
		Day d1 = Enum.valueOf(Day.class, days[0].name());
		Day d2 = Day.valueOf(Day.class, days[0].name());
		System.out.println(d1);
		System.out.println(d2);
		
		
	}
}

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}