package thinkinjava.util;


import java.util.LinkedList;

/**
 * Created by Rocky on 2017/9/17.
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();
    //存
    public void push(T t) {
        storage.addFirst(t);
    }
    //取，不删除
    public T peek() {
        return storage.getFirst();
    }
    //取，删除
    public T pop() {
        return storage.removeFirst();
    }
    //判断是否为空
    public boolean isEmpty() {
        return storage.isEmpty();
    }
    public String toString() {
        return storage.toString();
    }

}
