package Queue;

import java.util.*;

public class deque {
    

    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();

        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        d.addLast(5);
        d.addLast(6);
        d.addLast(7);
        d.addLast(8);
        d.addLast(9);
        d.addLast(10);

        System.out.println(d);

        while (!d.isEmpty()) {
            System.out.print(d.getFirst() + " ");
            d.removeFirst();
        }


        System.out.println();
        
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        d.addLast(5);
        d.addLast(6);
        d.addLast(7);
        d.addLast(8);
        d.addLast(9);
        d.addLast(10);

        System.out.println(d);

        while (!d.isEmpty()) {
            System.out.print(d.getLast () + " ");
            d.removeLast();
        }    
        
 
        

    }
}
