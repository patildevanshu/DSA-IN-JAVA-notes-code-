package CONDSTATE;
import java.util.*;

public class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       // int b= 11;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && b>c){
            System.out.println("a is the greatest no.");
        }
        else if (b>a && a>c){
            System.out.println("b is the greatest no.");
        }
        else{
            System.out.println("c is the gratest no.");
        }

        

    
        
    }
    
}
