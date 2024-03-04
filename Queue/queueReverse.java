package Queue;
import java.util.*;
public class queueReverse {
    
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();


        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue <Integer> s = new LinkedList<>();

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);
        s.add(10);

        reverse(s);

        // print

        while (!s.isEmpty()) {
            System.out.println(s.remove());
        }
    }
}
