package lab1;

import static lab1.PackgingMethods.*;
import static showClasses.ShowMatrix.*;
import static laboratory2.UnpackingMethods.*;
public class Main {

    public static void main(String[] args) {

//        double[][] matr = {{0,5,2,0,0},
//                            {0,0,7,0,0},
//                            {0,4,0,6,1},
//                            {0,3,0,0,9},
//                            {0,0,0,0,0}};
        double[][] matr = {{0, 0, 0, 0, 0, 0},
                {9, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 12, 1},
                {0, 5, 0, 4, 0, 0},
                {32, 0, 8, 0, 0, 0}};
        //packing
        System.out.println("Исходная таблица:");
        printMatrix(matr);
        System.out.println();
        tableConnections(matr);
        System.out.println("Модифицированная строчко-столбцовая схема упаковки:");
        modifiedRowColumnSchemePacking(matr);
////
//        System.out.println();
//        System.out.println("Структура смежности по строкам:");
//        adjacenciesByRowStructure(matr);
//        System.out.println();
//        System.out.println("Структура смежности по столбцам:");
//        columnAdjacencyStructure(matr);
////
//        System.out.println();
//        System.out.println("Строчная схема упаковки:");
//        lowercasePackagingScheme(matr);
//
//        System.out.println();
//        System.out.println("Столбцовая схема упаковки:");
//        columnarPackagingScheme(matr);

//        System.out.println();
//        System.out.println("Строчно-столбцовая схема упаковки:");
//        rowColumnPackingScheme(matr);


        //unpacking
        System.out.println();

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

//        System.out.println("Матрица смежности после таблицы связей");
//        unpackingTheRelationshipTable(matrixTA, matrixTC);

//        double[] arrayAL = {0,5,2,0,7,0,4,6,1,0,3,9,0,0};
//        int[] arrayJ = {1,2,3,2,3,3,2,4,5,4,2,5,5,0};
//        double[] arrayAL = {0,0,9,0,0,12,1,0,5,4,0,32,0};
//        int[] arrayJ = {1,2,1,3,4,5,6,5,2,4,6,1,3,0};
//        System.out.println("Матрица смежности после структуры смежности по строкам");
//        unpackingTheAdjacencyStructureLines(arrayAL, arrayJ);

//        double[] arrayAL2 = {0,0,5,4,3,0,2,7,0,6,0,1,9,0};
//        int[] arrayI = {1,2,1,3,4,3,1,2,4,3,5,3,4,0};
//        System.out.println("Матрица смежности после структуры смежности по столбцам");
//        unpackingTheAdjacencyStructureColumns(arrayAL2, arrayI);
//
//        double[] arrayAL3 = {5,2,7,4,6,1,3,9};
//        int[] arrayJ2 = {2,3,3,2,4,5,2,5};
//        int[] arrayIC = {1,3,4,7,9,9};
//        System.out.println("Матрица смежности после строчной схемы упаковки");
//        unpackingTheLowercasePackingScheme(arrayAL3, arrayJ2, arrayIC, 5);
//
//        double[] arrayAL4 = {5,4,3,2,7,6,1,9};
//        int[] arrayI2 = {1,3,4,1,2,3,3,4};
//        int[] arrayJC = {0,0,3,5,6,8};
//        System.out.println("Матрица смежности после столбцовой схемы упаковки");
//        unpackingTheColumnPackingScheme(arrayAL4, arrayI2, arrayJC, 5);
//
//        double[] arrayAL5 = {5,2,7,4,6,1,3,9};
//        int[] arrayI3 = {1,1,2,3,3,3,4,4};
//        int[] arrayJ3 = {2,3,3,2,4,5,2,5};
//        System.out.println();
//        double[] arrayAL5 = {9,12,1,5,4,32,8};
//        int[] arrayI3 = {2,4,4,5,5,6,6};
//        int[] arrayJ3 = {1,5,6,2,4,1,3};
//        System.out.println("Матрица смежности после строчно-столбцовой схемы упаковки");
//        unpackingTheRowColumnPackingScheme(arrayAL5, arrayI3, arrayJ3, 6);

//        double[] arrayAL6 = {5,2,7,4,6,1,3,9};
//        int[] arrayK = {6,11,12,8,18,23,9,24};
//        System.out.println("Матрица смежности после модифицированной строчно-столбцовой схемы упаковки");
//        unpackingModifiedRowColumnPackingScheme(arrayAL6, arrayK, 5);
    }
}
