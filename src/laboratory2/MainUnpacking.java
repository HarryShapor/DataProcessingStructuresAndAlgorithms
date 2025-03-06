package laboratory2;

import static lab1.PackgingMethods.*;
import static laboratory2.UnpackingMethods.*;
import static showClasses.ShowMatrix.printMatrix;

public class MainUnpacking {

    public static void main(String[] args) {
        int[][] matrixTA = {{2,3,0},
                {3,0,0},
                {2,4,5},
                {2,5,0},
                {0,0,0}};
        double[][] matrixTC = {{5,2,0},
                {7,0,0},
                {4,6,1},
                {3,9,0},
                {0,0,0}};

        System.out.println("Матрица смежности после таблицы связей");
        unpackingTheRelationshipTable(matrixTA, matrixTC);

        double[] arrayAL = {0,5,2,0,7,0,4,6,1,0,3,9,0,0};
        int[] arrayJ = {1,2,3,2,3,3,2,4,5,4,2,5,5,0};
        System.out.println("Матрица смежности после структуры смежности по строкам");
        unpackingTheAdjacencyStructureLines(arrayAL, arrayJ);

        double[] arrayAL2 = {0,0,5,4,3,0,2,7,0,6,0,1,9,0};
        int[] arrayI = {1,2,1,3,4,3,1,2,4,3,5,3,4,0};
        System.out.println("Матрица смежности после структуры смежности по столбцам");
        unpackingTheAdjacencyStructureColumns(arrayAL2, arrayI);

        double[] arrayAL3 = {5,2,7,4,6,1,3,9};
        int[] arrayJ2 = {2,3,3,2,4,5,2,5};
        int[] arrayIC = {1,3,4,7,9,9};
        System.out.println("Матрица смежности после строчной схемы упаковки");
        unpackingTheLowercasePackingScheme(arrayAL3, arrayJ2, arrayIC, 5);

        double[] arrayAL4 = {5,4,3,2,7,6,1,9};
        int[] arrayI2 = {1,3,4,1,2,3,3,4};
        int[] arrayJC = {0,0,3,5,6,8};
        System.out.println("Матрица смежности после столбцовой схемы упаковки");
        unpackingTheColumnPackingScheme(arrayAL4, arrayI2, arrayJC, 5);

        double[] arrayAL5 = {5,2,7,4,6,1,3,9};
        int[] arrayI3 = {1,1,2,3,3,3,4,4};
        int[] arrayJ3 = {2,3,3,2,4,5,2,5};
        System.out.println("Матрица смежности после строчно-столбцовой схемы упаковки");
        unpackingTheRowColumnPackingScheme(arrayAL5, arrayI3, arrayJ3, 5);

        double[] arrayAL6 = {5,2,7,4,6,1,3,9};
        int[] arrayK = {6,11,12,8,18,23,9,24};
        System.out.println("Матрица смежности после модифицированной строчно-столбцовой схемы упаковки");
        unpackingModifiedRowColumnPackingScheme(arrayAL6, arrayK, 5);
    }
}
