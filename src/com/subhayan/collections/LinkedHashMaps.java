/*
Same as HashMaps, LinkedHashMaps are also used for storing K-V
All operations like put, get, remove are constant time o(1)
In HashMap, in the hash table only values will be present
But in LinkedHashMap, there will be two pointers additionally ---> [values|next|prev]   here next and prev are the pointers
These pointers are used to maintain the order in which keys are inserted in the hash table
for first element, prev is null
for last element, next is null
Follows open addressing Hashing method
If size is specified, we insert more than size then it'll remove the first key, then the second key and so on..
If set accessOrder to true it enables LRU (Least Recently Used), then the LRU key will be removed first from the Map -- used in Cache
Iterating through the Map is costlier as it is done using Doubly LL
 */
package com.subhayan.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true) {  // accessOrder
            // To force the fixed size
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 5;   // returns true when size is more than 5
                                     // either LRU (when accessOrder is true) or the first inserted entry will be removed
            }
        };
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        String s = lhm.get(3);
        s = lhm.get(1);
        lhm.forEach((k, v) -> System.out.println(k + " " + v));
        /*
                2 B  -- not accessed, so LRU key
                3 C  -- accessed before 1
                1 A  -- most recently accessed
         */
        System.out.println("Test of key removal");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F"); // this will remove 2 B
        lhm.forEach((k, v) -> System.out.println(k + " " + v));
        /*
                3 C  -- becomes LRU key
                1 A
                4 D
                5 E
                6 F
         */
    }
}
