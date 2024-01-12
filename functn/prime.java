package functn;
import java.util.*;

public class prime {
     public static boolean isprime(int n){
        boolean isprime = true;
        if (n==2){
            isprime = false;
        }
        for (int i = 2; i <=n-1; i++){
            if (n % i == 0){
                isprime= false;
            }
        }
        return isprime;
     }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println(isprime(sc.nextInt()));

    }
}