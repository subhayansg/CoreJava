package com.subhayan.generics;

public class BeforeGenerics {
    public static void main(String[] args) {
        Object obj = new String("hello");
        obj = 10;  // assigning Integer to String type object
//        String str = obj;  // this needs to be cast to String as obj is of String type originally
        String str = (String) obj;
        // As can be seen, there is no type safety (compiler doesn't point an error), we can assign Strings, Integer to the same object
        // It is when we run this, we get ClassCastException
    }
}
