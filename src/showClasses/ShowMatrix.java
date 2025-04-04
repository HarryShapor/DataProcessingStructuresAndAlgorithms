package showClasses;

public class ShowMatrix {

    public static void printMatrix(int[][] matr){
        for(int i=0; i < matr.length; i++){
            for(int j=0; j <matr[i].length; j++){
                System.out.print(matr[i][j] +"\t\t\t" );
            }
            System.out.println();
        }
    }
    public static void printMatrix(double[][] matr){
        for(int i=0; i < matr.length; i++){
            for(int j=0; j <matr[i].length; j++){
                System.out.print(matr[i][j] +"\t\t\t" );
            }
            System.out.println();
        }
    }

}
