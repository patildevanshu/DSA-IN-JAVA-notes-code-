package ArrayList;

import java.util.*;

public class Basics{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Boolean> list2 = new ArrayList<>();
        ArrayList <String> list3 = new ArrayList<>();
        ArrayList <Float> list4 = new ArrayList<>();

        // Add operations
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1 , 6);

        System.out.println(list);

        // get operation O(1)
        int element = list.get(4);
        System.out.println(element);

        // remove element operaton O(n)
        list.remove(3);
        System.out.println(list);

        // set integer at index O(n)
        list.set(0, 6);
        System.out.println(list);

        // is contains O(n)
        System.out.println(list.contains(6));
        System.out.println(list.contains(1));

        // length
        System.out.println(list.size());
    }
}
