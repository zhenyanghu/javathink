package othertest.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException extends RuntimeException {

	public MyException(String msg) {
		super(msg);
	}
	
	public static void main(String[] args) {
		try{
//            throw new MyException("自定义异常");
			f();
        }catch(Throwable e){
//        	System.out.println(e.ge);
            System.out.println(e.getCause());
        }
	}
	
	public static void f() throws Throwable {
		try {
			FileInputStream fis = new FileInputStream("d:/text");
		} catch (FileNotFoundException e) {
			System.out.println("f()方法中的异常: " + e);
			Throwable se = e.initCause(e);
			System.out.println("包装后的异常" + se);
//			throw se;
		}
	}
}
