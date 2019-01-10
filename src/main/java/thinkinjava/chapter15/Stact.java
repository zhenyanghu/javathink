package thinkinjava.chapter15;


import java.util.LinkedList;

/**
 * Created by Rocky on 2017/11/8.
 */
class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();

    public void push(T t) {
        linkedList.addFirst(t);
    }
    public T peek() {
        return linkedList.getFirst();
    }
    public T pop() {
//        T result;
//        if (linkedList != null) {
//            result = linkedList.removeFirst();
//        }
        return linkedList.removeFirst();
    }
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
    public String toString() {
        return linkedList.toString();
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
        String s;
        while ((s = stack.pop()) != null) {
            System.out.println(s);
        }
    }

}
