package src.laboratory5;

public class Main5 {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(12);
        s.push(13);
        s.push(15);
        System.out.println(s.pop());
        s.push(14);

//        System.out.println(s.empty());
        System.out.println(s.toString());

        System.out.println(s.ret());
//        System.out.println(s.toString());
    }
}
