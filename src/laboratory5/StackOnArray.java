package src.laboratory5;

public class StackOnArray {

    private int[] array;
    public int pos = -1;

    public StackOnArray(){
        this.array = new int[100];
    }

    public StackOnArray(int size){
        this.array = new int[size];
    }


    public void makenull(){
        this.pos = -1;
    }

    public void push(int x) {
        if (this.pos < this.array.length){
            this.array[++pos] = x;
        }
        else {
            throw new RuntimeException("Стек переполнен!");
        }
    }

    public int ret() {
        if (this.pos != 0){
            return this.array[pos];
        }
        throw new RuntimeException("Стек пуст");
    }

    public int pop() {
        if (this.pos != 0){
            return this.array[pos--];
        }
        throw new RuntimeException("Стек пуст");
    }

    public boolean empty() {
        return true ? this.pos == -1 : false;
    }


    @Override
    public String toString(){
        String s = "";
        for (int i=this.pos; i >= 0; i--){
            s += this.array[i] + " -> ";
        }
        s += "null";
        return s;
    }
}
