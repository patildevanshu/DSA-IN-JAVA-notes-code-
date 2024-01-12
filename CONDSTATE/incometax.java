package CONDSTATE;
import java.util.*;
public class incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax;

        if (income<500000){
            tax = 0;
            System.out.println("total tax on your income is" + tax);
        } else if (income>500000 && income<3000000){
            tax = income*0.20f;
            System.out.println("total tax on your income is" + tax);
        } else if (income > 3000000){
            tax = income*0.30f;
            System.out.println("total tax on your income is" + tax);
        } else { 
            System.out.println("enter a valid integer");
        

        
            
        }

    }
    
}
