/*
This class implements unordered maps, so the keys are not sorted
This class is not thread-safe and permits one null key
Maps are not iterable, need to convert them to set to make them iterable
 */
package com.subhayan.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D"));
        hm.put(5, "E");
        hm.put(6, "F");
        System.out.println(hm);   // {1=A, 2=B, 3=C, 4=D, 5=E, 6=F}
        System.out.println(hm.getOrDefault(9, "X"));  // X as 9 is not present

        // Iterate through the Map
        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();  // convert to Set
        for(Map.Entry<Integer, String> entry: entrySet)
            System.out.println(entry.getKey() + ", " + entry.getValue());

        Set<Integer> keySets = hm.keySet();
        for(Integer key : keySets)
            System.out.println(key + ", " + hm.get(key));
    }
}
