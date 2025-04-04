package practic2;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        System.out.println("Случайный порядок");
        int[] mass = {34, 7, 89, 12, 55, 21, 78, 3, 67, 45};
        int[] mass1 = {42, 17, 8, 63, 29, 91, 5, 76, 34, 58, 12, 49, 23, 85, 3, 67, 10, 54, 88, 19};
        int[] mass2 = {72, 14, 56, 9, 33, 88, 2, 47, 25, 61, 37, 19, 84, 5, 90, 11, 78, 43, 29, 66, 3, 55, 21, 99, 8, 70, 12, 41, 34, 27};
        mass = selectionSort(mass);
        System.out.println(Arrays.toString(mass));
        System.out.println("Почти упорядочены");
        int[] mass3 = {2, 5, 7, 4, 10, 12, 15, 14, 18, 20};
        int[] mass4 = {3, 5, 7, 2, 10, 12, 15, 14, 18, 20, 22, 25, 24, 27, 30, 29, 33, 35, 38, 40};
        int[] mass5 = {1, 2, 4, 3, 5, 6, 8, 7, 9, 10, 12, 11, 13, 15, 14, 16, 17, 19, 18, 20, 22, 21, 23, 25, 24, 26, 27, 29, 28, 30};
        mass1 = selectionSort(mass3);
        System.out.println(Arrays.toString(mass1));
        System.out.println("Обратный порядок");
        int[] mass6 = {92, 85, 77, 63, 54, 48, 39, 31, 22, 14};
        int[] mass7 = {95, 87, 78, 74, 69, 65, 58, 54, 49, 42, 37, 33, 28, 24, 19, 15, 12, 9, 5, 2};
        int[] mass8 = {60, 58, 56, 54, 52, 50, 48, 46, 44, 42, 40, 38, 36, 33, 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1};
        mass2 = selectionSort(mass6);
        System.out.println(Arrays.toString(mass2));

    }

     public static int[] selectionSort(int[] array) {
        int x;
        int countExchange = 0;
        int countComparison = 0;
        for (int left = 0; left < array.length; left++) {
            int indexMin = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[indexMin]) {
                    indexMin = i;
                }
                countComparison += 1;
            }
            x = array[left];
            array[left] = array[indexMin];
            array[indexMin] = x;
            countExchange += 2;
        }
        System.out.println("Count Exchanges = " + countExchange);
        System.out.println("Count Сomparison = " + countComparison);
        return array;
     }
}