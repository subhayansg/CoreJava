package com.subhayan.generics;

class MyArray3<T> {
    T[] genericArr = (T[]) new Object[6];
    int len = 0;
    public void append(T val) {
        genericArr[len++] = val;
    }
    public void display() {
        for(int i = 0; i < len; i++)
            System.out.println(genericArr[i]);
    }
}

public class GenericMethods {
    static <E extends Number> void show(E[] list) {   // declare method as generic as well
        for(E item: list)
            System.out.println(item);
    }

    /*
     >>> generic argument: Wildcards
     >>> Unbounded wildcard -> ?
            static void fun(MyArray3<?> obj)
            static void fun(MyArray3 obj)    --> Both are same
     >>> Upper Bounded wildcard -> extends
            static void fun(MyArray3<? extends Number> obj)    --> Any child class of Number is ALLOWED
            MyArray3<Float> ma1 = new MyArray3<>();
            MyArray3<Integer> ma1 = new MyArray3<>();
     >>> Lower Bounded wildcard: super
            static void fun(MyArray3<? super Number> obj)
            Here, only the classes that are super classes of Number, those types are allowed
            e.g.
            class A{}
            class B extends A{}
            class C extends B{}
            static void fun(MyArray3<? super B> obj) { }
            MyArray3<A> ma1 = new MyArray3<>();  --> This is ALLOWED, as A is super class of B
            MyArray3<B> ma2 = new MyArray3<>();  --> This is ALLOWED, as lower bound starts from B
            MyArray3<C> ma3 = new MyArray3<>();  --> This is NOT ALLOWED, as C is not a super class of B
    */
    static void fun(MyArray3<?> obj) {
        obj.display();
    }

    public static void main(String[] args) {
//        show(new String[]{"Hi", "Hello", "You"});  // This fails as E extends Number
        show(new Integer[]{10, 20, 30});

        MyArray3<String> ma1 = new MyArray3<>();
        ma1.append("Hi");
        ma1.append("hello");

        MyArray3<Integer> ma2 = new MyArray3<>();
        ma2.append(10);
        ma2.append(20);

        fun(ma1);
        fun(ma2);

    }
}
