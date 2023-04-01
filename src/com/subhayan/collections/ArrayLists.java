package com.subhayan.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        al1.add(10);
        al1.add(0, 5);  // 5 will be placed before 10
        al1.addAll(al2);
        System.out.println("Printing entire array list without loops");
        System.out.println(al1);  // [5, 10, 50, 60, 70, 80, 90]
        // Accessing elements
        System.out.println("Using for loop");
        for(int i = 0; i < al1.size(); i++)
            System.out.print(al1.get(i) + " ");
        System.out.println();
        // for (Integer i : al1) System.out.print(i + " ");  // enhanced for
        // Using Iterator: allows movement in only forward direction
        System.out.println("Using Iterator");
        Iterator<Integer> it = al1.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // Using ListIterator: allows movement in both forward and backward direction
        System.out.println("Using List Iterator");
        ListIterator<Integer> li = al1.listIterator();
        while(li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();
        /* replacing while loop with for loop
        for(ListIterator<Integer> li = al1.listIterator(); li.hasNext(); )
            System.out.print(li.next() + " ");
         */
        // Using lambda
        System.out.println("Using lambda expression");
        al1.forEach(element -> System.out.print(element + " "));  // al1.forEach(System.out::print);
        System.out.println();

        al1.forEach(n -> show(n));  // al1.forEach(ArrayLists::show);

        // Convert an ArrayList to an Array
        Integer[] arr1 = al1.toArray(new Integer[0]);  // passing the size of the array to be 0, i.e. less than the
                                                       // size of the ArrayList creates another array of proper size
        for (int x : arr1)
            System.out.print(x + " ");
    }

    private static void show(Integer n) {
        if (n > 60)
            System.out.print(n + " ");
    }
}
