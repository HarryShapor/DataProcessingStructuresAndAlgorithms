package lab1;

import java.util.Arrays;

public class PackgingMethods {

    public static void tableConnections(double[][] matr){
        int d = maxD(matr);
        double[][] matrixTA = new double[matr.length][d];
        double[][] matrixTC = new double[matr.length][d];
        for (int i=0; i < matr.length; i++){
            for (int j =0; j < d; j++){
                matrixTA[i][j] = 0;
                matrixTC[i][j] = 0;
            }
        }
        for (int i=0; i < matr.length; i++){
            int k = 0;
            if (Arrays.stream(matr[i]).sum() != 0) {
                for (int j = 0; j < matr[i].length; j++) {
                    if (matr[i][j] != 0) {
                        matrixTA[i][k] = j+1;
                        matrixTC[i][k] = matr[i][j];
                        k += 1;
                    }
                }
            }
            else {
                continue;
            }
        }
        System.out.println("Таблица связей:");
        printMatr(matrixTA);
        System.out.println();
        System.out.println("Таблица весов:");
        printMatr(matrixTC);
    }

    private static int countNonZero(double[] array){
        int count = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] != 0){
                count += 1;
            }
        }
        return count;
    }

    public static void printMatr(double[][] matr){
        for(int i=0; i < matr.length; i++){
            for(int j=0; j <matr[i].length; j++){
                System.out.print(matr[i][j] +"\t" );
            }
            System.out.println();
        }
    }
    public static void printArray(double[] array){
        for(int i=0; i < array.length; i++){
            if(array[i] != 0){
                System.out.print(array[i] + "\t");
            }
        }
    }
    public static void printArray(int[] array){
        for(int i=0; i < array.length; i++){
            if(array[i] != 0){
                System.out.print(array[i] + "\t");
            }
        }
    }
    public static int maxD(double[][] matr){
        int d = 0;
        for(int i =0; i < matr.length; i++){
            int di = countNonZero(matr[i]);
            if (di != 0 && d < di){
                d = di;
            }
        }
        return d;
    }

    public static void modifiedRowColumnSchemePacking(double[][] matr){
        int n = matr.length;
        double[] arrayAl = new double[n * matr[0].length];
        int[] arrayK = new int[n * matr[0].length];

        int k = 0;
        for (int i=0; i < matr.length; i++){
            for(int j=0; j < matr[i].length; j++){
                if (matr[i][j] != 0){
                    arrayAl[k] = matr[i][j];
                    arrayK[k] = (i+1) + (j)*n;
                    k += 1;
                }
            }
        }
        System.out.println("Список ненулевых элементов:");
        printArray(arrayAl);
        System.out.println();
        System.out.println("Список индексов K:");
        printArray(arrayK);
    }
}
