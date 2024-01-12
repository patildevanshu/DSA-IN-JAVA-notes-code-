package loops;

import java.util.*;

public class star{
    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);

       // int n= sc.nextInt();

        for (int line=1 ; line<=10 ; line++ ){
            for (int j=1 ; j<=line ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int line=1 ; line<=10 ; line++ ){
            for (int j=10 ; j>=line ; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }System.out.println();
        
        // int v=0;
        for (int line=1 ; line<=10 ; line++ ){
            for (int j=1 ; j<=line ; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }System.out.println();


        char ch = 'A';

        for (int line=1 ; line<=10 ; line++ ){
            for (int j=1 ; j<=line ; j++ ){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}