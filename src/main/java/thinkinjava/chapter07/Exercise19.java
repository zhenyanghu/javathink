package thinkinjava.chapter07;

public class Exercise19 {

	public static void main(String[] args) {
		BBB.main(args);
		System.out.println("-------------");
		BBB bbb = new BBB();
		AAA aaa = bbb.getAaa();
		aaa.setName("xiaoxigua");
		aaa.setInterest("lol");
		System.out.println(aaa);
		AAA aaa1 = bbb.getAaa();
		System.out.println(aaa1);
		aaa1.setName("xiaoyu");
		System.out.println(aaa);
		System.out.println(aaa1);
	/*	aaa = new AAA();
		System.out.println(aaa);*/
	}
}

class AAA {
	private  String name;
	private String interest;
	public AAA(String name, String interest) {
		System.out.println("AAAconstructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String toString() {
		return "She is " + name + ", and she love " + interest;
	}
	
}

class BBB {
	private final AAA aaa;
	public BBB() {
		aaa = new AAA("yuanyuan", "lol");
	}
	public AAA getAaa() {
		return aaa;
	}
	public static void main(String[] args) {
		BBB bbb = new BBB();
		System.out.println(bbb.getAaa());
	}
	
}