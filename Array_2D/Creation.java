package Array_2D;
import java.util.*;
public class Creation{

    public static void search(int a[][], int key ) {

        int n = a.length;
        int m= a[0].length;

        for (int i=0; i<n; i++){
            for ( int j=0; j<m; j++){
                if (key == a[i][j]){
                    System.out.println("key found at" + "("+ i + "," + j + ")");
                }
            }
        }
        
    }

    public static void input(int a[][]) {

        int n = a.length;
        int m= a[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter data");
        for (int i=0; i<n; i++){
            for ( int j=0; j<m; j++){
                a[i][j]= sc.nextInt();
            }
        }

        
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
    public static boolean staircasesearch(int matric[][], int key) {

        int row = 0 , col = matric[0].length -1;
        
        while (row<matric.length && col>= 0) {
            if (matric[row][col] == key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if (key < matric[row][col]){
                col--;
            }
            else {
                row++;
            }
            
        }
        System.out.println("key not found");
        return false;
    }
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no. of rows you want");
        // int n = sc.nextInt();
        // System.out.println("Enter of columns You want");
        // int m = sc.nextInt();
        // int matric[][] = new int[n][m];

        // System.out.println("Enter key you want to search");
        // int key = sc.nextInt();
        // input(matric);
        // print(matric);
        // search(matric, key);

        int matric[][]= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int key = 13;

        staircasesearch(matric, key);

    }
}