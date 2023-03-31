/*
HashSet won't be ordered
LinkedHashSet would preserve the insertion order
 */
package com.subhayan.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        System.out.println("LinkedHashSet");
        lhs.add("A");
        lhs.add("E");
        lhs.add("C");
        lhs.add("S");
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");

        System.out.println("\nHashSet");
        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("E");
        hs.add("C");
        hs.add("S");
        Iterator<String> itr2 = hs.iterator();
        while (itr2.hasNext())
            System.out.print(itr2.next() + " ");
    }
}
