package lab1;

import static lab1.PackgingMethods.*;
import static showClasses.ShowMatrix.*;
import static laboratory2.UnpackingMethods.*;
public class MainPacking {

    public static void main(String[] args) {

        double[][] matr = {{0,5,2,0,0},
                            {0,0,7,0,0},
                            {0,4,0,6,1},
                            {0,3,0,0,9},
                            {0,0,0,0,0}};
//        double[][] matr = {{0, 0, 0, 0, 0, 0},
//                {9, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 12, 1},
//                {0, 5, 0, 4, 0, 0},
//                {32, 0, 8, 0, 0, 0}};
        //packing
        System.out.println("Исходная таблица:");
        printMatrix(matr);
        System.out.println();
        tableConnections(matr);
        System.out.println("Модифицированная строчко-столбцовая схема упаковки:");
        modifiedRowColumnSchemePacking(matr);

        System.out.println();
        System.out.println("Структура смежности по строкам:");
        adjacenciesByRowStructure(matr);
        System.out.println();
        System.out.println("Структура смежности по столбцам:");
        columnAdjacencyStructure(matr);

        System.out.println();
        System.out.println("Строчная схема упаковки:");
        lowercasePackagingScheme(matr);

        System.out.println();
        System.out.println("Столбцовая схема упаковки:");
        columnarPackagingScheme(matr);

        System.out.println();
        System.out.println("Строчно-столбцовая схема упаковки:");
        rowColumnPackingScheme(matr);
    }
}
