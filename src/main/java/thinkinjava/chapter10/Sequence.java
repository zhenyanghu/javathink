package thinkinjava.chapter10;

/**
 * Created by Rocky on 2017/9/18.
 */
public class Sequence {
    private Object[] items;
    private int next =0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }
    private class SquenceSelector implements Selector {
        private int i = 0;
        //i是否等于了数组的长度，如果等于了，说明结束了
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
        //生成外部内的引用
        public Sequence getSequenceInstance() {
            return Sequence.this;
        }
    }
    public Selector selector() {
        return new SquenceSelector();
    }

    public static void main(String[] args) {
      /*  Sequence sequence = new Sequence(10);
        for (int i=0; i<10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current()+" ");
            selector.next();
        }*/
        Sequence sequence1 = new Sequence(3);
        sequence1.add(new Exercise2("曹操"));
        sequence1.add(new Exercise2("孙权"));
        sequence1.add(new Exercise2("刘备"));
        Selector selector1 = sequence1.selector();
        while (!selector1.end()) {
            System.out.println(selector1.current());
            selector1.next();
        }
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}