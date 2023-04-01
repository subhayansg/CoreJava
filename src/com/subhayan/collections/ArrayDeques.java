/*
Stored elements in Array can be inserted and deleted from both the ends for a Deque
insert at one end and delete from other end - queue [FIFO]
insert and delete from same end - stack [LIFO]
--> As a rule of thumb, as both ArrayDeque as well as LinkedList implements the Deque interface
    use LinkedList when we need a queue operation (FIFO)
    And use ArrayDeque when we need a stack operation (LIFO) although ArrayDeque can be used to implement Queue as well
 */
package com.subhayan.collections;

import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        // Insertion at last end
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);
        dq.forEach(element -> System.out.print(element + " "));
        // Deletion at last end
        dq.removeFirst();

        System.out.println();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.forEach(element -> System.out.print(element + " "));
    }
}
