package designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Rocky
 * @Date: 2020/5/9
 * @Description:
 */
public class DynamicProxy {

    public static void main(String[] args) {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Subject proxySubject = (Subject) myInvocationHandler.bind(new realSubject());
        proxySubject.doSomeThing("Rocky");
    }

}


interface Subject {
    void doSomeThing(String name);
}

class realSubject implements Subject {

//    private String name;
//
//    public realSubject(String name) {
//        this.name = name;
//    }

    @Override
    public void doSomeThing(String name) {
        System.out.println(name + " 开始工作...");
    }
}

class MyInvocationHandler implements InvocationHandler {

    // 需要代理的对象
    private Object target;

    public Object bind(Object target) {
        this.target = target;
        // 生成最终的代理类对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before...");
        Object result = method.invoke(this.target, args);
        System.out.println("after...");
        return result;
    }
}