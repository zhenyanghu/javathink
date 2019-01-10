package enumdemo.inter;

public interface Defaultable {

	default String myDefaultMethod() {
		return "Default Implementation";
	}
	
	//测试
	public static void main(String[] args) {
		System.out.println(new DefaultImpl().myDefaultMethod());
		System.out.println(new OverridableImpl().myDefaultMethod());
	}
	default void f() {
		this.myDefaultMethod();
	}
}

class DefaultImpl implements Defaultable {
	//DefaultableImpl实现了Defaulable接口，没有对默认方法做任何修改
}

class OverridableImpl implements Defaultable {
	//OverridableImpl实现了Defaulable接口重写接口的默认实现，提供了自己的实现方法。
	@Override
	public String myDefaultMethod() {
		return "Overridden implementation";
	}
	
}