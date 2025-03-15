package practic2;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {


        int[] array10_1 = {2, 7, 1, 9, 4, 6, 0, 3, 8, 5};
        int[] array20_1 = {15, 3, 8, 12, 19, 5, 1, 10, 17, 6, 14, 0, 9, 16, 2, 11, 18, 4, 13, 7};
        int[] array30_1 = {22, 7, 15, 29, 5, 11, 1, 20, 26, 3, 13, 9, 18, 24, 0, 10, 16, 2, 12, 28, 4, 14, 21, 27, 6, 19, 25, 8, 23, 17};
        System.out.println("Случайный порядок");
        System.out.println(Arrays.toString(selectionSort(array10_1)));
        System.out.println(Arrays.toString(selectionSort(array20_1)));
        System.out.println(Arrays.toString(selectionSort(array30_1)));

        int[] array10_2 = {0, 3, 2, 1, 4, 8, 6, 7, 5, 9};
        int[] array20_2 = {0, 2, 1, 4, 3, 6, 5, 8, 7, 9, 10, 14, 12, 11, 13, 15, 19, 17, 16, 18};
        int[] array30_2 = {0, 1, 2, 6, 4, 3, 5, 7, 8, 9, 10, 11, 12, 16, 14, 13, 15, 17, 21, 19, 18, 20, 22, 23, 27, 25, 24, 26, 28, 29};
        System.out.println("Почти отсортированный массив");
        System.out.println(Arrays.toString(selectionSort(array10_2)));
        System.out.println(Arrays.toString(selectionSort(array20_2)));
        System.out.println(Arrays.toString(selectionSort(array30_2)));

        int[] array10_3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] array20_3 = {19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] array30_3 = {29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("Обратный порядок");
        System.out.println(Arrays.toString(selectionSort(array10_3)));
        System.out.println(Arrays.toString(selectionSort(array20_3)));
        System.out.println(Arrays.toString(selectionSort(array30_3)));
    }

    public static int[] selectionSort(int[] array){
        int countExchange = 0;
        int countComparison = 0;
        int indexMin;
        int x;
        for (int j = 0; j < array.length-1; j++) {
            indexMin = j;
            for (int i = j; i < array.length; i++) {
                if (array[i] < array[indexMin]) {
                    indexMin = i;
                }
                countComparison += 1;
            }
            if (indexMin != j) {
                x = array[indexMin];
                array[indexMin] = array[j];
                array[j] = x;
                countExchange += 1;
            }
        }
        System.out.println("Количество сравнений = " + countComparison);
        System.out.println("Количество перестановок = " + countExchange);
        return array;
    }
}
