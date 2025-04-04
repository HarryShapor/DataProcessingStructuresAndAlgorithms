package practic3;

import java.util.Arrays;

public class SortingSimpleInserts {

    public static void main(String[] args) {

        int[] array10_1 = {34, 7, 89, 12, 55, 21, 78, 3, 67, 45};
        int[] array20_1 = {42, 17, 8, 63, 29, 91, 5, 76, 34, 58, 12, 49, 23, 85, 3, 67, 10, 54, 88, 19};
        int[] array30_1 = {72, 14, 56, 9, 33, 88, 2, 47, 25, 61, 37, 19, 84, 5, 90, 11, 78, 43, 29, 66, 3, 55, 21, 99, 8, 70, 12, 41, 34, 27};
        System.out.println("Случайный порядок");
        System.out.println(Arrays.toString(sortingSimpleInserts(array10_1)));
        System.out.println(Arrays.toString(sortingSimpleInserts(array20_1)));
        System.out.println(Arrays.toString(sortingSimpleInserts(array30_1)));

        int[] array10_2 = {2, 5, 7, 4, 10, 12, 15, 14, 18, 20};
        int[] array20_2 = {3, 5, 7, 2, 10, 12, 15, 14, 18, 20, 22, 25, 24, 27, 30, 29, 33, 35, 38, 40};
        int[] array30_2 = {1, 2, 4, 3, 5, 6, 8, 7, 9, 10, 12, 11, 13, 15, 14, 16, 17, 19, 18, 20, 22, 21, 23, 25, 24, 26, 27, 29, 28, 30};
        System.out.println("Почти отсортированный массив");
        System.out.println(Arrays.toString(sortingSimpleInserts(array10_2)));
        System.out.println(Arrays.toString(sortingSimpleInserts(array20_2)));
        System.out.println(Arrays.toString(sortingSimpleInserts(array30_2)));

        int[] array10_3 = {92, 85, 77, 63, 54, 48, 39, 31, 22, 14};
        int[] array20_3 = {95, 87, 78, 74, 69, 65, 58, 54, 49, 42, 37, 33, 28, 24, 19, 15, 12, 9, 5, 2};
        int[] array30_3 = {60, 58, 56, 54, 52, 50, 48, 46, 44, 42, 40, 38, 36, 33, 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1};
        System.out.println("Обратный порядок");
        System.out.println(Arrays.toString(sortingSimpleInserts(array10_3)));
        System.out.println(Arrays.toString(sortingSimpleInserts(array20_3)));
        System.out.println(Arrays.toString(sortingSimpleInserts(array30_3)));
    }

    public static int[] sortingSimpleInserts(int[] array) {

        int countExchange = 0;
        int countComparison = 0;
        int s = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                countComparison += 1;
            } else {
                s = array[i];
                array[i] = array[i - 1];
                countExchange += 2;
                int j = i - 1;
                while (j >= 0 && array[j] > s) {
                    array[j + 1] = array[j];
                    countExchange += 1;
                    j = j - 1;
                    countComparison += 1;
                }
                array[j + 1] = s;
                countExchange += 1;
            }
        }
        System.out.println("Количество сравнений = " + countComparison);
        System.out.println("Количество перестановок = " + countExchange/3);
        return array;
    }
}
