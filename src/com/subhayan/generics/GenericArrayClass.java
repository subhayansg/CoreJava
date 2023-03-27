package com.subhayan.generics;

class GenericArray<T> {
    T[] genericArr = (T[]) new Object[6];
    int len = 0;
    public void append(T val) {
        genericArr[len] = val;
        len++;
        // genericArr[len++] = val;
    }
    public void display() {
        for(int i = 0; i < len; i++)
            System.out.println(genericArr[i]);
    }
}

public class GenericArrayClass {
    public static void main(String[] args) {
        GenericArray<Integer> ga = new GenericArray<>();
        ga.append(10);
        ga.append(20);
        ga.append(30);
        ga.display();
    }
}
