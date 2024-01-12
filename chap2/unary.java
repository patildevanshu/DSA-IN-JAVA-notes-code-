package chap2;

public class unary {
    public static void main(String args[]){
        int a=1;
        int b=++a; // pre decrement 1. value change then value use
       // int c = a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("___________________________________________");

        int A = 1;
        int B = A++;// in post decrement  1. value use then change
        // chode is readed line by line under main function 
        System.out.println(A);
        System.out.println(B);
        System.out.println("___________________________________________");

         int c=10;
        int d=--c; // pre decrement 1. value change then value use
       // int c = a+b;
        System.out.println(c);
        System.out.println(d);
        System.out.println("___________________________________________");

        int C = 10;
        int D = C--;// in post decrement  1. value use then change
        // chode is readed line by line under main function 
        System.out.println(C);
        System.out.println(D); 
        System.out.println("___________________________________________");

    }
    
}
