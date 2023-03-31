/*
Guranteed log(n) time cost for basic operations (add, remove an contains)
 */
package com.subhayan.collections;

import java.util.List;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40)); // It'll remove duplicates and it'll be sorted
        System.out.println(ts);  // [10, 30, 40, 50, 70]
    }
}
