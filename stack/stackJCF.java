package stack;
import java.util.*;
public class stackJCF {

    // print stack
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
    public static void printStackChar(Stack<Character> s){
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    // puch a data at bottom of a stack
    public static void pushAtBottom(Stack<Integer> s , int data){
        // O(n)
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // reverse a string using stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
           result.append(s.pop()) ;
        }
        return result.toString();
    }

    // reverser a stack O(n^2)
    public static void reverseStack(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    // stock span problem
    // span means = max no. of consecutive days for which 
    // price <= todays price
    public static void stockSpan(int stock[] , int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] =1;
        s.push(0);
        
        for(int i = 1 ; i<stock.length ; i++){
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice >stock[s.peek()]) {
                s.pop();
            }
            if ( s.isEmpty()) {
                span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }







    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(4);
        // s.push(3);
        // s.push(2);
        // s.push(1);
        // s.push(0);

        // // printStack(s);
        // pushAtBottom(s, 5);
        // // printStack(s);
        
        // // String str = "devanshu-patil";
        // // String result = reverseString(str);
        // // System.out.println(result);
        
        // reverseStack(s);
        // printStack(s);

        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];
        stockSpan(stock , span);

        for (int i = 0 ; i< span.length ; i++){
            System.out.println(span[i] + " ");
        }

    }
}
