/*
Java has doubly linked list implementation of Linked List in Collections
 */
package com.subhayan.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>(); // no initial size, nodes are created when we insert elements
                                                      // nodes get deleted when elements are removed
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));
        ll1.add(10);
        ll1.add(0, 5);  // 5 will be placed before 10
        ll1.addAll(ll2);
        ll1.addFirst(100);
        ll1.addLast(100);
        System.out.println(ll1);  // [100, 5, 10, 50, 60, 70, 80, 90, 100]
    }
}
