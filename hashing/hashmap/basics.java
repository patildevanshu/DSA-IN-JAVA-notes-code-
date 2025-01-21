package hashing.hashmap;

import java.util.*;

public class basics {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        // add elements to hashmap
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("UK", 300);
        hm.put("China", 400);
        hm.put("Russia", 500);
        hm.put("Japan", 600);
        hm.put("Germany", 700);

        // get elements from hashmap
        System.out.println(hm.get("India"));

        // remove elements from hashmap
        System.out.println(hm.remove("India"));

        // check if key exists
        System.out.println(hm.containsKey("India"));

        // print hm
        System.out.println(hm);

        // iterate over hashmap
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println(k + " " + hm.get(k));
        }

    }
}
