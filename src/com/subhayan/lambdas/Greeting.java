package com.subhayan.lambdas;

@FunctionalInterface
public interface Greeting {
    public void perform();
    default int add(int a, int b) {   // we can add private, default access specifier, not public or protected
        return a + b;
    }
}
