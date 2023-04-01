/*
Stored elements in Array can be inserted and deleted from both the ends for a Deque
insert at one end and delete from other end - queue [FIFO]
insert and delete from same end - stack [LIFO]
--> As a rule of thumb, as both ArrayDeque as well as LinkedList implements the Deque interface
    use LinkedList when we need a queue operation (FIFO)
    And use ArrayDeque when we need a stack operation (LIFO) although ArrayDeque can be used to implement Queue as well
 */

package com.subhayan.collections.riddhi;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueAndStack {
    public static void main(String[] args) {
        // Implementing a Queue using LinkedList, by default a LinkedList behaves as a Queue (FIFO)
        Queue<Integer> q = new LinkedList<>();  // Here Queue is an interface, not a FIFO queue
        q.offer(1);
        q.offer(2);
        System.out.println("After insert: " + q);  // [1, 2]
        q.poll(); // removes
        System.out.println("After remove: " + q);  // [2]  --> 1 is removed as was inserted first

        // Implementing a Queue(FIFO) using ArrayDeque, Insert at one end (Last), delete from other (First)
        Deque<Integer> qa = new ArrayDeque<>();
        qa.offerLast(1);
        qa.offerLast(2);
        System.out.println("After insert: " + qa);  // [1, 2]
        qa.pollFirst();
        System.out.println("After remove: " + qa);  // [2]  --> 1 is removed as was inserted first

        // Implementing a Stack(LIFO) using ArrayDeque, Insert and Delete both at same end
        Deque<Integer> sa = new ArrayDeque<>();
        sa.offerLast(1);
        sa.offerLast(2);
        System.out.println("After insert: " + sa);  // [1, 2]
        sa.pollLast();
        System.out.println("After remove: " + sa);  // [1]  --> 2 is removed as was inserted last

        // We also have Stack class to implement Stack
    }
}
