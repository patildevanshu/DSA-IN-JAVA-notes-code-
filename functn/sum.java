package functn;
import java.util.*;

public class sum {
     public static int summ(int i, int j){ // i and j are the parameters or formal parameters .
        int z = i + j;
        System.out.println(z);
        return z;
    }
    
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();

       int v= summ(a,b);// a and b are arguments or actual parameters

      System.out.println("the sum of two no. is " + v );
    }
}
