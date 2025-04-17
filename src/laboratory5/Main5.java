package src.laboratory5;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите выражение в польской форме записи:");
        String polishEntry = s.nextLine();
        int[] array = new int[100];
        int i = 0;
        while (true){
            int j = s.nextInt();
            if (j == -1){
                break;
            }
            array[i++] = j;
        }
//        System.out.println(polishEntry);
        Stack<Integer> stack = new Stack<>();
        int a1;
        int a2;
        i = 0;
        for (char el : polishEntry.toCharArray()){
            switch (el) {
                case '+' :
                    a1 = stack.pop();
                    a2 = stack.pop();
                    stack.push(a1 + a2);
                    continue;
                case '-' :
                    a1 = stack.pop();
                    a2 = stack.pop();
                    stack.push(a2 - a1);
                    continue;
                case '/' :
                    a1 = stack.pop();
                    a2 = stack.pop();
                    stack.push(a2 / a1);
                    continue;
                case '*' :
                    a1 = stack.pop();
                    a2 = stack.pop();
                    stack.push(a1 * a2);
                    continue;
                case '^' :
                    a1 = stack.pop();
                    a2 = stack.pop();
                    stack.push((int) Math.pow(a2, a1));
                    continue;
                default:
                    stack.push(array[i++]);
            }
        }
        System.out.println(stack.toString());
        System.out.println(stack.pop());
    }
}
