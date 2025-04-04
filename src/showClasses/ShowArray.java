package showClasses;

public class ShowArray {

    public static void printArrayNonZero(double[] array){
        for(int i=0; i < array.length; i++){
            if(array[i] != 0){
                System.out.print(array[i] + "\t");
            }
        }
    }
    public static void printArrayNonZero(int[] array){
        for(int i=0; i < array.length; i++){
            if(array[i] != 0){
                System.out.print(array[i] + "\t");
            }
        }
    }

}
