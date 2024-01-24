package Array_2D;
import java.util.*;
public class practicesquestions {

    public static void findkey(int matric[][] , int key) {
        int count =0;
        int n = matric.length;
        int m = matric[0].length;
        //  time complexity is O(n'2)
        for (int i = 0; i<n ; i++){
            for (int j = 0; j< m; j++){
                if (key == matric[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void sumofrow(int matric[][] , int row) {
        int sum = 0;
        for (int i = 0; i<matric[row-1].length; i++){
            sum+=matric[row-1][i];
        }
        System.out.println(sum);
    }
    public static int[][] transpose(int matric[][] ) {
        int n = matric.length;
        int m= matric[0].length;
        int transposematrix[][] = new int[n][m];
        for ( int i = 0; i<n; i++){
            for ( int j=0; j<m ; j++){
                transposematrix[j][i]= matric[i][j];
            }
        }
        return transposematrix;
    }
    public static void print(int a[][]) {

        int n = a.length;
        int m= a[0].length;
        System.out.println("Your 2D Array is");
        for (int i=0; i<n ; i++){
            System.out.print("[");
            for (int j =0;j<m ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("]");
        }
        
    }
    public static void main(String[] args) {
        int matric[][]= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        findkey(matric, 6);
        sumofrow(matric, 2);
        print(transpose(matric));
    }
}
