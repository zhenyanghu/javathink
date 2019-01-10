package thinkinjava.chapter06;

 class Exercise05Ext extends Exercise05 {

	public static void main(String[] args) {
		Exercise05 e = new Exercise05Ext();
		e.sayHello();//protected可以访问到
		e.name = "姚明";//public可以访问
		e.age = 30;  //默认同包内访问
		//e.sex = '男';//private是访问不到的
	}
}
