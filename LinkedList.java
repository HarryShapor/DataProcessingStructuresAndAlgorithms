// Класс для представления узла списка
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
    
    // Конструктор
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    // Вставка элемента в список на указанную позицию
    public void ins(int value, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Позиция вне границ");
        }
        
        Node newNode = new Node(value);
        
        if (position == 0) {
            // Вставка в начало списка
            newNode.next = head;
            head = newNode;
        } else {
            // Вставка в середину или конец списка
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }
    
    // Удаление элемента из списка
    public boolean del(int value) {
        if (head == null) return false;
        
        if (head.data == value) {
            head = head.next;
            size--;
            return true;
        }
        
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        
        if (current.next != null) {
            current.next = current.next.next;
            size--;
            return true;
        }
        
        return false;
    }
    
    // Получение элемента по индексу
    public int ret(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне границ");
        }
        
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    
    // Поиск позиции элемента в списке
    public int locate(int value) {
        Node current = head;
        int position = 0;
        
        while (current != null) {
            if (current.data == value) {
                return position;
            }
            current = current.next;
            position++;
        }
        
        return -1; // Элемент не найден
    }
    
    // Очистка списка
    public void makenull() {
        head = null;
        size = 0;
    }
    
    // Вывод списка
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Получение размера списка
    public int getSize() {
        return size;
    }
    
    // Пример использования
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Тестирование методов
        list.ins(10, 0);  // Вставка в начало
        list.ins(20, 1);  // Вставка в конец
        list.ins(30, 1);  // Вставка в середину
        list.ins(40, 3);  // Вставка в конец
        
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