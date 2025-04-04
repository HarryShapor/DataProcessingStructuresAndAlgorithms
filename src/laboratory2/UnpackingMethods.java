package laboratory2;

import static showClasses.ShowMatrix.printMatrix;

public class UnpackingMethods {

    public static double[][] unpackingTheRelationshipTable(int[][] matrixTA, double[][] matrixTC){
        int n = matrixTA.length;
        double[][] matrix = new double[n][n];
        for (int i=0; i < n; i++){
            if (sumLineZero(matrixTA[i]) == true){
                continue;
            }
            for (int j=0; j < matrixTA[i].length; j++){
                if (matrixTA[i][j] != 0){
                    matrix[i][matrixTA[i][j]-1] = matrixTC[i][j];
                }
            }
        }
        System.out.println("Таблица смежности:");
        printMatrix(matrix);

        return matrix;
    }

    private static boolean sumLineZero(int[] array){
        double sum = 0;
        for (int i=0; i < array.length; i++){
            sum += array[i];
        }
        if (sum == 0){
            return true;
        }
        return false;
    }

    public static double[][] unpackingTheAdjacencyStructureLines(double[] arrayAL, int[] arrayJ){
        double[][] matrix = new double[maxElementArray(arrayJ)][maxElementArray(arrayJ)];
        int j = 0;
        for (int i =0; i < arrayAL.length; i++){
            if (arrayAL[i] == 0){
                j = arrayJ[i]-1;
                continue;
            }
            matrix[j][arrayJ[i]-1] = arrayAL[i];
        }
        System.out.println("Таблица смежности:");
        printMatrix(matrix);

        return matrix;
    }

    private static int maxElementArray(int[] array){
        int maxElement = array[0];
        for (int i =0; i < array.length; i++){
            if(array[i] > maxElement){
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static double[][] unpackingTheAdjacencyStructureColumns(double[] arrayAL, int[] arrayI){
        double[][] matrix = new double[maxElementArray(arrayI)][maxElementArray(arrayI)];
        int j = 0;
        for (int i =0; i < arrayAL.length; i++){
            if (arrayAL[i] == 0){
                j = arrayI[i]-1;
                continue;
            }
            matrix[arrayI[i]-1][j] = arrayAL[i];
        }
        System.out.println("Таблица смежности:");
        printMatrix(matrix);

        return matrix;
    }

    public static double[][] unpackingTheLowercasePackingScheme(double[] arrayAL, int[] arrayJ, int[] arrayIC, int sizeMatrix){
        double[][] matrix = new double[sizeMatrix][sizeMatrix];
        int k = 0;
        int row = 0;
        for (int i=0; i < arrayIC.length-1; i++){
            if (i+1 < arrayIC.length && arrayIC[i] == arrayIC[i+1]){
                row += 1;
            }
            else {
                if (arrayIC[i] != 0){
                    k = arrayIC[i]-1;
                }
                for (int j = k; j < arrayIC[i+1]-1; j++){
                    matrix[row][arrayJ[j]-1] = arrayAL[j];
                }
                row += 1;
            }
        }
        System.out.println("Таблица смежности:");
        printMatrix(matrix);

        return matrix;
    }

    public static double[][] unpackingTheColumnPackingScheme(double[] arrayAL, int[] arrayI, int[] arrayJC, int sizeMatrix){
        double[][] matrix = new double[sizeMatrix][sizeMatrix];
        int k =0;
        int column = 0;
        for (int i=0; i < arrayJC.length-1; i++){
            if (i+1 < arrayJC.length && arrayJC[i] == arrayJC[i+1]){
                column += 1;
            }
            else {
                for (int j = arrayJC[i]; j < arrayJC[i+1]; j++){
                    matrix[arrayI[j]-1][column] = arrayAL[j];
                }
                column += 1;
            }
        }

        System.out.println("Таблица смежности:");
        printMatrix(matrix);

        return matrix;
    }

    public static double[][] unpackingTheRowColumnPackingScheme(double[] arrayAL, int[] arrayI, int[] arrayJ, int sizeMatrix){
        double[][] matrix = new double[sizeMatrix][sizeMatrix];
        for (int i=0; i < arrayAL.length; i++){
            matrix[arrayI[i]-1][arrayJ[i]-1] = arrayAL[i];
        }

        System.out.println("Таблица смежности:");
        printMatrix(matrix);

        return matrix;
    }

    public static double[][] unpackingModifiedRowColumnPackingScheme(double[] arrayAL, int[] arrayK, int sizeMatrix){
        double[][] matrix = new double[sizeMatrix][sizeMatrix];
        int row, columm = 0;
        for (int i=0; i < arrayAL.length; i++){
            columm = (arrayK[i]/sizeMatrix) + 1;
            row = arrayK[i] - (columm - 1) * sizeMatrix;
            matrix[row-1][columm-1] = arrayAL[i];
        }

        System.out.println("Таблица смежности:");
        printMatrix(matrix);

        return matrix;
    }
}
