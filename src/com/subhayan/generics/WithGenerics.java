package com.subhayan.generics;

// class has to be made generic
public class WithGenerics<T> {
    // create a generic array (array of Generic type)
    T[] data = (T[]) new Object[3];

    public static void main(String[] args) {
        WithGenerics<String> wg = new WithGenerics();  // Make String type from Generic type
        wg.data[0] = "Hi";
        wg.data[1] = "Hello";
//        wg.data[2] = 10;  // This will fail as data is a String Type array, this is validated during compilation itself
        String str = wg.data[0]; // We don't need type casting like earlier; <<String str = (String) obj;>>
    }
}
