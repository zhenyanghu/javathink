package algorithm;

/**
 * Created by Rocky on 2017/9/7.
 */
public class Node {
    private String name;
    private int no;
    private int score;
    private Node next;//下一个节点的地址
    public Node(String name, int no, int score) {
        this.name = name;
        this.no = no;
        this.score = score;
        this.next = null;
    }
}
