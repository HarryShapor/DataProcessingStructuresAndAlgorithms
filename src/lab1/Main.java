package lab1;

import static lab1.PackgingMethods.*;

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
        System.out.println("Исходная таблица:");
        printMatr(matr);
        System.out.println();
        tableConnections(matr);
        System.out.println("Модифицированная строчко-столбцовая схема упаковки:");
        modifiedRowColumnSchemePacking(matr);

    }
}
