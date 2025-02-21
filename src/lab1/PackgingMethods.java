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
        printArrayNonZero(arrayAl);
        System.out.println();
        System.out.println("Список индексов K:");
        printArrayNonZero(arrayK);
    }

    public static void adjacenciesByRowStructure(double[][] matrix){
        int n = matrix.length;
        double[] arrayAl = new double[n * matrix[0].length];
        int[] arrayJ = new int[n * matrix[0].length];
        int k = 0;
        for (int i=0; i < n; i++){
            arrayAl[k] = 0;
            arrayJ[k++] = i+1;
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] != 0){
                    arrayAl[k] = matrix[i][j];
                    arrayJ[k++] = j + 1;
                }
            }
        }
        k++;
        System.out.println("Список ненулевых элементов:");
        for(int i=0; i < k-1; i++){
            System.out.print(arrayAl[i] + "\t");
        }
        System.out.println();
        System.out.println("Список индексов J:");
        for(int i=0; i < k; i++){
            System.out.print(arrayJ[i] + "\t");
        }
    }

    public static void columnAdjacencyStructure(double[][] matrix){
        int n = matrix.length;
        double[] arrayAl = new double[n * matrix[0].length];
        int[] arrayI = new int[n * matrix[0].length];
        int k = 0;
        for (int i=0; i < n; i++){
            arrayAl[k] = 0;
            arrayI[k++] = i+1;
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[j][i] != 0){
                    arrayAl[k] = matrix[j][i];
                    arrayI[k++] = j + 1;
                }
            }
        }
        k++;
        System.out.println("Список ненулевых элементов:");
        for(int i=0; i < k; i++){
            System.out.print(arrayAl[i] + "\t");
        }
        System.out.println();
        System.out.println("Список индексов I:");
        for(int i=0; i < k; i++){
            System.out.print(arrayI[i] + "\t");
        }
    }

    public static void lowercasePackagingScheme(double[][] matrix){
        int n = matrix.length;
        double[] arrayAl = new double[n * matrix[0].length];
        int[] arrayJ = new int[n * matrix[0].length];
        int[] arrayIC = new int[n * matrix[0].length];
        int k = 0; //индекс для массивов arrayAl и arrayJ
        int y = 0; //индекс для массива arrayIC
        for (int i=0; i < n; i++){
            arrayIC[y++] = k+1;
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] != 0){
                    arrayAl[k] = matrix[i][j];
                    arrayJ[k++] = j + 1;
//                    y+=1;
                }
            }
            arrayIC[y] = k+1;
        }
        System.out.println("Список ненулевых элементов:");
        for(int i=0; i < k; i++){
            System.out.print(arrayAl[i] + "\t");
        }
        System.out.println();
        System.out.println("Список индексов J:");
        for(int i=0; i < k; i++){
            System.out.print(arrayJ[i] + "\t");
        }
        System.out.println();
        System.out.println("Список индексов IC:");
        for(int i=0; i < k; i++){
            if (arrayIC[i] != 0)
                System.out.print(arrayIC[i] + "\t");
        }
    }

    public static void columnarPackagingScheme(double[][] matrix){
        int n = matrix.length;
        double[] arrayAl = new double[n * matrix[0].length];
        int[] arrayJ = new int[n * matrix[0].length];
        int[] arrayIC = new int[n * matrix[0].length];
        int k = 0; //индекс для массивов arrayAl и arrayJ
        int y = 0; //индекс для массива arrayIC
        for (int i=0; i < n; i++){
            arrayIC[y++] = k;
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[j][i] != 0){
                    arrayAl[k] = matrix[j][i];
                    arrayJ[k++] = j + 1;
                }
            }
            arrayIC[y] = k;
        }
        System.out.println("Список ненулевых элементов:");
        for(int i=0; i < k; i++){
            System.out.print(arrayAl[i] + "\t");
        }
        System.out.println();
        System.out.println("Список индексов J:");
        for(int i=0; i < k; i++){
            System.out.print(arrayJ[i] + "\t");
        }
        System.out.println();
        System.out.println("Список индексов IC:");
        for(int i=0; i < k; i++){
            System.out.print(arrayIC[i] + "\t");
        }
    }

    public static void rowColumnPackingScheme(double[][] matrix){
        int n = matrix.length;
        double[] arrayAl = new double[n * matrix[0].length];
        int[] arrayI = new int[n * matrix[0].length];
        int[] arrayJ = new int[n * matrix[0].length];

        int k = 0;
        for (int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                if (matrix[i][j] != 0){
                    arrayAl[k] = matrix[i][j];
                    arrayI[k] = i+1;
                    arrayJ[k] = j+1;
                    k += 1;
                }
            }
        }
        System.out.println("Список ненулевых элементов:");
        printArrayNonZero(arrayAl);
        System.out.println();
        System.out.println("Список индексов I:");
        printArrayNonZero(arrayI);
        System.out.println();
        System.out.println("Список индексов J:");
        printArrayNonZero(arrayJ);
    }
}
