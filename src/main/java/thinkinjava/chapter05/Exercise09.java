package thinkinjava.chapter05;

public class Exercise09 {

	public static void main(String[] args) {
		GirlFriend gf = new GirlFriend();
		System.out.println("你的女朋友的名字叫做："+gf.getName()+",年龄为："+gf.getAge()+"岁");
		GirlFriend gf1 = new GirlFriend(23);
		System.out.println("你的女朋友的名字叫做："+gf1.getName()+",年龄为："+gf1.getAge()+"岁");
	}
}

class GirlFriend {
	private int age;
	private String name;
	GirlFriend() {
		this(24,"yuanyuan");
	}
	GirlFriend(int age) {
		this(age, "yuanyan");
		this.age = age;
	}
	GirlFriend(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
