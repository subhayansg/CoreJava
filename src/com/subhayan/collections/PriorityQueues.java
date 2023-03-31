/*
In a priority queue, elements are inserted or deleted based on their priority
Always the highest priority one is deleted
A priority queue is used to implementing heap
*/
package com.subhayan.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2)
            return 1;   // for max heap, opposite
        else if (o1 > o2)
            return -1;
        else
            return 0; // returns 0 when they are equal
    }
}

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> min_pq = new PriorityQueue<>();
        min_pq.add(20);
        min_pq.add(10);
        min_pq.add(30);
        min_pq.add(5);
        min_pq.add(15);
        min_pq.add(3);

        PriorityQueue<Integer> max_pq = new PriorityQueue<>(new MyComparator());  // Max heap
        max_pq.add(20);
        max_pq.add(10);
        max_pq.add(30);
        max_pq.add(5);
        max_pq.add(15);
        max_pq.add(3);

        System.out.println("Max heap: "+ max_pq.peek());
        max_pq.forEach(element -> System.out.print(element + " "));
        System.out.println("\nAfter deletion of max heap: ");
        max_pq.poll();
        max_pq.forEach(elements -> System.out.print(elements + " "));
        /*
        Max heap: 30
        30 15 20 5 10 3
        After deletion of max heap:
        20 15 3 5 10
         */

        System.out.println("\nMin heap: "+ min_pq.peek());
        min_pq.forEach(element -> System.out.print(element + " "));
        System.out.println("\nAfter deletion of min heap: ");
        min_pq.poll();
        min_pq.forEach(elements -> System.out.print(elements + " "));
        /*
        Min heap: 3
        3 10 5 20 15 30
        After deletion of min heap:
        5 10 30 20 15
         */
    }
}
