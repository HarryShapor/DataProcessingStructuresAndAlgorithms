package laboratory4;

class Node {
    int data;
    Node next;
    
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void ins(int value, int position) {
        if (position < 0 || position > this.size) {
            throw new IndexOutOfBoundsException("Позиция вне границ");
        }
        Node newNode = new Node(value);
        if (position == 0) {
            newNode.next = this.head;
            this.head = newNode;
        } else {
            Node current = this.head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        this.size++;
    }

    public boolean del(int value) {
        if (this.head == null) return false;
        
        if (this.head.data == value) {
            this.head = this.head.next;
            this.size--;
            return true;
        }
        
        Node current = this.head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        
        if (current.next != null) {
            current.next = current.next.next;
            this.size--;
            return true;
        }
        return false;
    }

    public int ret(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Индекс вне границ");
        }
        
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int locate(int value) {
        Node current = this.head;
        int position = 0;
        
        while (current != null) {
            if (current.data == value) {
                return position;
            }
            current = current.next;
            position++;
        }
        
        return -1;
    }

    public void makenull() {
        this.head = null;
        this.size = 0;
    }

    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.ins(10,0);
        list.ins(20,1);
        list.ins(20,2);
        list.ins(20, 3);
        list.ins(30,2);
        System.out.print("Список после вставки: ");
        list.print();
        System.out.println("Размер списка: " + list.getSize());
        System.out.println("Элемент по индексу 2: " + list.ret(2));
        System.out.println("Позиция элемента 30: " + list.locate(30));
        list.del(20);
        System.out.print("Список после удаления 20: ");
        list.print();
        list.makenull();
        System.out.print("Список после очистки: ");
        list.print();
    }
} 