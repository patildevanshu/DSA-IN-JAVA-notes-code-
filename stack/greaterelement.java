package stack;
import java.util.*;
public class greaterelement {
    // next greater element
    // the next grater element of some element x in an array is thr first greater
    // that is to the right of x in the same array

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack <Integer> s= new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length-1 ; i>= 0 ; i--){
            // whileloop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // if else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            }
            else{
                nxtGreater[i] = arr[s.peek()];
            }

            // push in stack
            s.push(i);
        }

        for (int i = 0 ; i< nxtGreater.length ; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();

        // next greater right
        // next greater left
        // next smaller left
        // next smaller right
    
    }
}
