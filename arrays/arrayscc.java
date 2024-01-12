package arrays;
import java.util.*;
public class arrayscc {
    
    public static int allin_one(int array[], int key){
        int n = array.length;
        // for finding an number in array
        for (int i=0; i<n ; i++){           
            if (array[i]==key){
                System.out.println(i);
            }
        }
        
    }

    public static void main(String args[]){
        int number[] = {7,5,9,6,8,4,2,6,3,5,7,9,7,1};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.println(allin_one(number, key));

    }

    
}
