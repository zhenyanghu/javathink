package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rocky on 2017/9/7.
 */
public class CH03_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf;//缓冲字符输入流
        buf = new BufferedReader(new InputStreamReader(System.in)); //是字节流通向字符流的桥梁
        int num;
        String name;
        int score;
        LinkedList list = new LinkedList();
        System.out.println("请输入5个学生数据：");
        for(int i=0; i<5; i++) {
            System.out.println("请输出学号：");
            num = Integer.parseInt(buf.readLine());
            System.out.println("请输入姓名：");
            name = buf.readLine();
            System.out.println("请输入成绩：");
            score = Integer.parseInt(buf.readLine());
            list.insert(num, name, score);
            System.out.println("------------------");
        }
        System.out.println("学生成绩为：");
        list.print();
        list.delete(new Node(1,"xiaoming", 100));
        list.print();
    }
}
