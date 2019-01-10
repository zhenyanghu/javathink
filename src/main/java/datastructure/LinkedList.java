package datastructure;

/**
 * Created by Rocky on 2017/9/7.
 */
public class LinkedList {

    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }
    public void print() {
        Node current = this.first;
        while (current != null) {
            System.out.println("[" + current.data + " " + current.names + " " + current.np + "]" );
            current = current.next;
        }
        System.out.println();
    }
    public void insert(int data, String names, int np) {
        Node newNode = new Node(data, names, np);
        if (this.isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

    }
    public void delete(Node delNode) {

        Node newNode;
        Node tmp;//前一个
        if (first.data == delNode.data) {//删除第一个
            first = first.next;
        } else if (last.data == delNode.data) {//删除最后一个
            newNode = first;
            while (newNode.next != last) {
                newNode = newNode.next;
            }
            newNode.next = last.next;//为null
            last = newNode;
        } else {//删除中间的节点
            newNode = first;
            tmp = first;
            while (newNode.data != delNode.data) {
                tmp = newNode;
                newNode = newNode.next;
            }
            tmp.next = delNode.next;
        }

    }

}

class Node {
    int data;
    int np;
    String names;
    Node next;

    public Node(int data, String names, int np) {
        this.data = data;
        this.names = names;
        this.np = np;
        this.next = null;
    }
}