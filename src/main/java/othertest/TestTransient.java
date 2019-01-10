package othertest;

import java.io.*;

/**
 * Created by Rocky on 2017/8/17.
 */
public class TestTransient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person a = new Person(1, "张三");
        System.out.println(a);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e://transient.txt"));
        oos.writeObject(a);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e://transient.txt"));
        Person a1 = (Person) ois.readObject();
        System.out.println(a1);
        ois.close();
    }
}

class Person implements Serializable {
    private  int num;
    //不需要序列化的字段用transient修饰
    private transient String name;

    public Person(int num, String name) {
        this.num = num;
        this.name = name;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "编号："+num+"  姓名："+name;
    }
}
