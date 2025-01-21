package hashing.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class basics {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);

        // iteration
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // 50 20 40 10 30 - Random order
        }
        System.out.println();

        // for each loop
        for (int i : hs) {
            System.out.print(i + " "); // 50 20 40 10 30 - Random order
        }


        System.out.println(hs); // [50, 20, 40, 10, 30] - Random order

        hs.remove(20);
        System.out.println(hs); // [50, 40, 10, 30]

        System.out.println(hs.contains(30)); // true
        System.out.println(hs.isEmpty());

        System.out.println(hs.size()); // 4
        hs.clear();
        System.out.println(hs.isEmpty()); // true
        System.out.println(hs.size()); // 0
        
    }
}
