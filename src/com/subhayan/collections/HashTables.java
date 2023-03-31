/*
This is a legacy class
stores K-V
 */
package com.subhayan.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();  // Uses Objects
        // Hashtable<Integer, String> ht = new Hashtable<>();  // Uses Generics
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        String s = (String) ht.get(3);

        Enumeration e = ht.elements();
        while(e.hasMoreElements())
            System.out.print(e.nextElement() + " ");  // prints the values
        System.out.println();
        Enumeration e2 = ht.keys();
        while (e2.hasMoreElements())
            System.out.print(e2.nextElement() + " ");  // prints the keys

        System.out.println();
        // change one of the values
        ht.compute(2, (k, v) -> "Z");
        System.out.println(ht);  // {5=E, 4=D, 3=C, 2=Z, 1=A}
    }
}
