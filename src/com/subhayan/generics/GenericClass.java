package com.subhayan.generics;

class Data<T> {
    private T obj;  // so the Data class is having only one field which stores object of any type

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.setObj(10);
        System.out.println(d.getObj());
        /* To get this Data class to store String
         Data<String> d = new Data<>();
         d.setObj("Hi");
         */
    }
}
