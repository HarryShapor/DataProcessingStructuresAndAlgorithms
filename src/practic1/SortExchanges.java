package practic1;

import java.util.Arrays;

public class SortExchanges {

    public static void main(String[] args) {
        System.out.println("Случайный порядок");
        int[] mass = {4,7,123,64,12,89,24,63,875,12,75,124,689,17,5784,29,5674,28,56,91,574,571,515,687,5426,156,13,561,84,30};
        mass = sortExchanges(mass);
        System.out.println(Arrays.toString(mass));
        System.out.println("Почти упорядочены");
        int[] mass1 = {4,12,7,10,11,13,15,14,20,17,30,28,29,45,46,44,64,65,62,89,63,120,574,333,875,999,123,987,1200};
        mass1 = sortExchanges(mass1);
        System.out.println(Arrays.toString(mass1));
        System.out.println("Обратный порядок");
        int[] mass2 = {999,875,123,89,64,63,62,61,60,59,58,57,56,55,54,53,29,28,27,26,25,24,13,12,7,6,5,4,3,2};
        mass2 = sortExchanges(mass2);
        System.out.println(Arrays.toString(mass2));
    }

    public static int[] sortExchanges(int[] massiv) {

        int countExchange = 0;
        int countComparison = 0;

        for(int j =0; j < massiv.length; j++) {
            int countExchangeLocal = 0;
            for (int i = 0; i < massiv.length - 1; i++) {
                if (massiv[i] > massiv[i + 1]) {
                    int x = massiv[i + 1];
                    massiv[i + 1] = massiv[i];
                    massiv[i] = x;
                    countExchange += 1;
                    countExchangeLocal += 1;
                }
                countComparison += 1;
            }
            if (countExchangeLocal == 0){
                break;
            }
        }
        System.out.println("Count Exchanges = " + countExchange);
        System.out.println("Count comparison = " + countComparison);
        return massiv;
    }

}
