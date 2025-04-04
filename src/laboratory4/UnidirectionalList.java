package laboratory4;

public class UnidirectionalList<T> {

    private T[] array;
    private int pos = 0;
    private int size;


    public UnidirectionalList(){
        this.array = (T[]) new Object[100];
        this.size = 100;
    }

    public UnidirectionalList(int size){
        this.array = (T[]) new Object[size];
        this.size = size;
    }

    public void ins(T x){
        try {
            this.array[this.pos] = x;
        }
        catch (RuntimeException e){
            this.increasingSize();
            this.array[this.pos] = x;
        }
        this.pos++;
    }

    public void ins(T x, int p){
            if (p == this.pos){
                this.ins(x);
            }
            if (p >= 0 && p < pos) {
                for (int i = pos; i > p; i--){
                    try{
                        this.array[i] = this.array[i-1];
                    }
                    catch (RuntimeException e){
                        this.increasingSize();
                        this.array[i] = this.array[i-1];
                    }
                }
                this.array[p] = x;
            }
            else{
                throw new RuntimeException("Ошибка позиции!");
            }
        this.pos += 1;
    }

    public T ret(int p){
        if (p < pos){
            return array[p];
        }
        else {
            throw new RuntimeException("Ошибка позиции!");
        }
    }

    public void del(int p){
        if (p >= 0 && p < pos) {
            for (int i = p; i < this.pos; i++){
                this.array[i] = this.array[i+1];
            }
        }
        else{
            throw new RuntimeException("Ошибка позиции!");
        }
        this.pos -= 1;
    }

    public int locate(T x){
        for (int i = 0; i < this.pos; i++){
            if (this.array[i].equals(x)){
                System.out.println(this.array[i]);
                return i+1;
            }
        }
//        throw new RuntimeException("Нет такого элемента!");
        return -1;
    }

    public void makeNull(){
        this.array = (T[]) new Object[size];
        this.pos = 0;
    }

    @Override
    public String toString(){
        String s = "";
        if (pos == 0){
            return "Список пуст!";
        }
        for (int i=0; i < pos; i++){
            s += array[i];
            if (i != pos-1){
                s += ", ";
            }
        }
        return s;
    }


    private void increasingSize(){
        int size2 = this.size + 100;
//        System.out.println("size2: " + size2);
        T[] array2 = (T[]) new Object[size2];
        for (int i=0; i < this.size; i++){
            array2[i] = this.array[i];
        }
        this.size = size2;
        this.array = array2;
    }

}
