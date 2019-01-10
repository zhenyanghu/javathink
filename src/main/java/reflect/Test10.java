package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test10 {

	public static void main(String[] args) {
		MyInvocationHandler demo = new MyInvocationHandler();
		Subject subject = (Subject) demo.bind(new RealSubject());
		String info = subject.say("张三", 26);
		System.out.println(info);
		
	}
}

//项目接口
interface Subject {
	public String say(String name, int age); 
}

//真实的项目
class RealSubject implements Subject {

	@Override
	public String say(String name, int age) {
		return name + " " + age;
	}
	
}

class MyInvocationHandler implements InvocationHandler {

	private Object object;
	public Object bind(Object object) { 
		this.object = object;
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object temp = method.invoke(this.object, args);
		return temp;
	}
	
}