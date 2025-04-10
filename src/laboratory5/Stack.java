package src.laboratory5;

class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class Stack {
    private Node head;

    public Stack() {
        this.head = null;
    }

    public void makenull(){
        this.head = null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        Node current = this.head;
        this.head = newNode;
        newNode.next = current;
    }

    public int ret() {
        if (this.head != null){
            return this.head.data;
        }
        throw new RuntimeException("Стек пуст");
    }

    public int pop() {
        if (this.head != null){
            int nodeData = this.head.data;
            this.head = this.head.next;
            return nodeData;
        }
        throw new RuntimeException("Стек пуст");
    }

    public boolean empty() {
        return true ? this.head == null : false;
    }


    @Override
    public String toString(){
        Node current = this.head;
        String s = "";
        while (current != null) {
            s += current.data + " -> ";
            current = current.next;
        }
        s += "null";
        return s;
    }
}
