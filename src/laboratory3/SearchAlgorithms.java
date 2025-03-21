package laboratory3;

/*
    Методы реализующие алгоритмы поиска индекса элемента в массиве.
 */
public class SearchAlgorithms {

    public static void main(String[] args) {

        int[] array10_1 = {3, 7, 12, 21, 34, 45, 55, 67, 78, 89};
        int[] array20_1 = {3, 5, 8, 10, 12, 17, 19, 23, 29, 34, 42, 49, 54, 58, 63, 67, 76, 85, 88, 91};
        int[] array30_1 = {2, 3, 5, 8, 9, 11, 12, 14, 19, 21, 25, 27, 29, 33, 34, 37, 41, 43, 47, 55, 56, 61, 66, 70, 72, 78, 84, 88, 90, 99};
        int v = 17;
        int[] array = array30_1;
        System.out.println("Бинарный поиск");
        int p = binarySearch2(array, v);
        if (p != 0){
            System.out.println("Индекс элемента " + p);
        }
        else{
            System.out.println("Элемент не найден!");
        }
        System.out.println("Линейный поиск");
        p = linearSearch(array, v);
        if (p != 0){
            System.out.println("Индекс элемента " + p);
        }
        else{
            System.out.println("Элемент не найден!");
        }
        System.out.println("Интерполяционный поиск");
        p = interpolationSearch(array, v);
        if (p != 0){
            System.out.println("Индекс элемента " + p);
        }
        else{
            System.out.println("Элемент не найден!");
        }

    }

    public static int binarySearch(int[] array, int value){
        //Бинарный поиск
        int lengthArray = array.length-1;
        int p = lengthArray/2;
        while(array[p] != value){
            if (p == 0 || p == lengthArray){
                p = -1;
                break;
            }
            if (array[p] > value){
                p *= 1.5;
            }
            else{
                p /= 2;
            }
        }
        return p+1;
    }

    public static int binarySearch2(int[] array, int value){
        //Бинарный итерационный поиск
        int L = 0;
        int H = array.length-1;
        int countComparison = 0;
        while(L <= H){
            int p = (L+H)/2;
            countComparison += 1;
            if (value == array[p]){
                System.out.println("Количество сравнений на данном прогоне: " + countComparison);
                return p+1;
            }
            else{
                if (value < array[p]){
                    H = p-1;
                }
                else{
                    L = p+1;
                }
                countComparison += 1;
            }
        }
        System.out.println("Количество сравнений на данном прогоне: " + countComparison);
        return 0;
    }

    public static int linearSearch(int[] array, int value){
        //Линейный поиск
        int countComparison = 0;
        for (int i = 0; i < array.length; i++){
            countComparison += 1;
            if (array[i] == value){
                System.out.println("Количество сравнений на данном прогоне: " + countComparison);
                return i+1;
            }
        }
        System.out.println("Количество сравнений на данном прогоне: " + countComparison);
        return 0;
    }

    public static int interpolationSearch(int[] array, int value){
        //Интерполяционный поиск
        int L = 0;
        int H = array.length-1;
        int countComparison = 0;
        if (value > array[H]){
            System.out.println("Количество сравнений на данном прогоне: " + countComparison);
            return 0;
        }
        while(L <= H){
            int p = L + (((value - array[L])*(H-L))/(array[H]-array[L]));
            countComparison += 1;
            if(array[p] == value) {
                System.out.println("Количество сравнений на данном прогоне: " + countComparison);
                return p+1;
            }
            if (array[p] > value){
                H = p-1;
            }
            else{
                L = p+1;
            }
            countComparison += 1;
        }
        System.out.println("Количество сравнений на данном прогоне: " + countComparison);
        return 0;
    }
}
