package Heaps Priority Queue;

import java.util.PriorityQueue;

public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        pq.add(7);
        pq.add(8);
        pq.add(2);
        pq.add(30);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
