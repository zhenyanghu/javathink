package thinkinjava.chapter07;

public class Exercise01 {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog dog = a.getDog();
		System.out.println(dog);
		dog = new Dog();
		System.out.println(dog);
	}
}

class Dog {
	private String s;
	public Dog() {
		System.out.println("无参构造");
		s = "constructed";
	}
	public String toString() {
		return s;
	}
}

class Animal {
	private Dog dog;
	
	public Dog getDog() {
		return this.dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
