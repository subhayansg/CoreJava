/*
Tree maintains the entries(K,V) in sorted order based on the Keys
Uses Red-Black tree based NavigableMap implementation
Implementation provides guranteed log(n) time cost for containsKey, get, put and remove operations
 */
package com.subhayan.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D"));
        tm.put(5, "E");
        tm.put(6, "F");
        System.out.println(tm);   // {1=A, 2=B, 3=C, 4=D, 5=E, 6=F}
        tm.put(8, "H");
        System.out.println(tm.ceilingEntry(7).getValue());  // H

        Map.Entry<Integer, String> e = tm.firstEntry();  // java.util.Map
        System.out.println(e.getKey() + " " + e.getValue()); // 1 A
    }
}
