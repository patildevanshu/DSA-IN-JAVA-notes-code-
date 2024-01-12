package loops;
import java.util.*;
public class whileloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    //     // while loop and print 1 to 10 no.
    //     int a=1;
    //     int c = 0;
    //     while (c<10){
    //         System.out.println("hello devanshu  =  " + a);
    //         a++;
    //         c+=1;
    //    }
    //      int n = sc.nextInt();
    //      int p=1;
    //      while (p<=n){
    //         System.out.print(p + " ");
    //         p++;
    //      }
            // code for summition of first natural number
            // int n = sc.nextInt();
            // int z = 0;
            // int i = 0;

            // while (z<=n){
            //   i=i+z;
            //   z++;
            // }
            // System.out.println(i);
            

            // code for printing reverse of a given number
            // int n =450221;
            
            // while (n>0){
            //     int ld= n%10;
            //     n = n/10;
            //     System.err.print(ld);
           // }

                // code for reversing a number
            int n =2833;
            int reverse=0;
            while (n>0){
                int ld= n%10;
                n = n/10;
                // System.err.print(ld);
                reverse=reverse*10+ld;
            }
            System.out.println(reverse);
        }
    }
    
