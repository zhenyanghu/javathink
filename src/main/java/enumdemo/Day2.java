package enumdemo;

public enum Day2 {

	MONDAY("星期一"),
	TUESDAY("星期二"), 
	WEDNESDAY("星期三"), 
	THURSDAY("星期四"), 
	FRIDAY("星期五"), 
	SATURDAY("星期六"), 
	SUNDAY("星期日");
	
	private String desc; //中文描述
	
	/**
	 * 私有的构造方法
	 * @param desc
	 */
	private Day2(String desc) {
		this.desc = desc;
	}
	
	/**
	 * 覆盖
	 */
	@Override
	public String toString() {
		return desc;
	}

	public static void main(String[] args) {
		for (Day2 day : Day2.values()) {
			System.out.println("name: " + day.name() + ", desc: " + day.toString());
		}
	}
}
/**
 输出结果：
	name: MONDAY, desc: 星期一
	name: TUESDAY, desc: 星期二
	name: WEDNESDAY, desc: 星期三
	name: THURSDAY, desc: 星期四
	name: FRIDAY, desc: 星期五
	name: SATURDAY, desc: 星期六
	name: SUNDAY, desc: 星期日
 */
