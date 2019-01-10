package thinkinjava.chapter09;

public class Exercise14 {

	public static void r(Ajk a) {
		a.a();
		a.b();
	}
	public static void s(Bjk b) {
		b.c();
		b.d();
	}
	public static void t(Cjk c) {
		c.e();
		c.f();
	}
	public static void u(Djk d) {
		d.a();
		d.b();
		d.c();
		d.e();
		d.f();
		d.g();
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		r(dog);
		s(dog);
		t(dog);
		u(dog);
	}
}

interface Ajk {
	void a();
	void b();
}

interface Bjk {
	void c();
	void d();
}

interface Cjk {
	void e();
	void f();
}

interface Djk extends Ajk, Bjk, Cjk {
	void g();
}

abstract class Animal {
	
}

class Dog extends Animal implements Djk {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		
	}
	
}