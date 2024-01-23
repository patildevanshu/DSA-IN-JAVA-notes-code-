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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows you want");
        int n = sc.nextInt();
        System.out.println("Enter of columns You want");
        int m = sc.nextInt();
        int matric[][] = new int[n][m];

        System.out.println("Enter key you want to search");
        int key = sc.nextInt();
        input(matric);
        print(matric);
        search(matric, key);
    }
}