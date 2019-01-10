package thinkinjava.chapter15;

/**
 * Created by Rocky on 2017/9/15.
 * 元组
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;
    public TwoTuple(A a, B b) {//构造方法不需要写泛型
        this.first = a;
        this.second = b;
    }
    public String toString() {
        return "(" + first + ". " + second + ")";
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
    public static TwoTuple f() {
        Phone p = new Phone("iphone");
        Computer c = new Computer();
        return new TwoTuple(p,c);
    }

}

/**"
 * 利用继承机制实现长度更长的元组
 * @param <A>
 * @param <B>
 * @param <C>
 */
class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C three;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.three = c;
    }

    @Override
    public String toString() {
        return "(" + first +", " + second + ", " + three + ")";
    }
}
