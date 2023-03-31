package com.subhayan.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D"));
        hm.put(5, "E");
        hm.put(6, "F");
        System.out.println(hm);   // {1=A, 2=B, 3=C, 4=D, 5=E, 6=F}
    }
}
