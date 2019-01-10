package thinkinjava.chapter15;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Rocky on 2017/11/8.
 * RandomList容器，调用select()随机获取一个对象
 */
public class RandomList<T> {

    private ArrayList<T> storage = new ArrayList<>();
    private Random random = new Random(47);

    public void add(T t) {
        storage.add(t);
    }

    public T select() {
        T t = storage.get(random.nextInt(storage.size()));
        return t;
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        for (String s : "The quick brown fox jumped over thie lazy brown dog".split(" ")) {
            randomList.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(randomList.select());
        }
    }

}
