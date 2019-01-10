package thinkinjava.chapter05;

public class MethodInit2 {

	int i = f();
	int j = g(i);
	int f() { return 11; }
	int g(int n) { return n*10; }
}

class MethodInit {
	//int j = g(i);  // 不和逻辑得向前引用
	int i = f();
	int f() {return 11;}
	int g(int n) {return n*10;}
}
