/*
Takes constant time O(1) cost for all basic operations
Occupies more space due to load factor
elements won't be sorted
 */
package com.subhayan.collections;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(10, 0.6f); // initialCapacity, loadFactor
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);  // this will not be added as Set does not allow duplicates
        hs.forEach(element -> System.out.print(element + " "));
    }
}
