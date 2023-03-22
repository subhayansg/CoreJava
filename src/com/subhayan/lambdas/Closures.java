package com.subhayan.lambdas;

interface Process {
    void process(int i);
}

public class Closures {
    public static void doProcess(int i, Process p) {
        p.process(i);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
//        b = 40;   // can't be modified
        doProcess(a, i -> System.out.println(i + b));   // lambda, value of b is captured
        doProcess(a, i -> System.out.println(i));  // can be changed like below
//        doProcess(a, System.out::println);       // method reference
    }
}
