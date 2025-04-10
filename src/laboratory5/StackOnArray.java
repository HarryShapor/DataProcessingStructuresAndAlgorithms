package src.laboratory5;

public class StackOnArray {

    private int[] array;

    public StackOnArray(){
        this.array = new int[100];
    }

    public StackOnArray(int size){
        this.array = new int[size];
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
        return true ? this. == null : false;
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
