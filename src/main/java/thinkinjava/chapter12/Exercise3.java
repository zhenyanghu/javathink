package thinkinjava.chapter12;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by Rocky on 2017/8/20.
 */
public class Exercise3 {
    private String name;
    private Formatter f;

    public Exercise3(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s The Turtle id at (%d, %d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream ps = System.err;
        Exercise3 e = new Exercise3("Tommy", new Formatter(ps) );
        e.move(0, 4);
        e.move(5,8);
    }
}
