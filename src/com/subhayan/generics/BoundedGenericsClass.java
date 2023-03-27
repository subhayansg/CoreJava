package com.subhayan.generics;

class A{}             // works with: interface A{]
class B extends A{}   // interface B implements A{}
class C extends A{}   // interface C implements A{}

class MyArray<T extends A> {
    T[] genericArr = (T[]) new Object[6];
    int len = 0;
    public void append(T val) {
        genericArr[len++] = val;
    }
}

class MyArray2<T extends Number> {
    T[] genericArr = (T[]) new Object[6];
    int len = 0;
    public void append(T val) {
        genericArr[len++] = val;
    }
}

public class BoundedGenericsClass {
    public static void main(String[] args) {
        MyArray2<Float> ma = new MyArray2<>(); // Only Number subclasses are allowed
    }
}
