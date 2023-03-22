/*
Although we can, but handling the exception that occurs from lambda should not be done at the applyProcess method
As, applyProcess may or may not know about the actual process that's going to run from the lambda
We can handle the exception in the lambda block itself, but that way we are no longer having a concise lambda expression
 */
package com.subhayan.lambdas;

import java.util.function.BiConsumer;

public class HandlingExceptionsInLambda {

    public static void applyProcess(int[] numbersArray, int key, BiConsumer<Integer, Integer> consumer) {
        try {
            for(int i : numbersArray) {
                consumer.accept(i, key);
            }
        } catch (ArithmeticException e) {
            System.out.println("key can't be 0. " + e);
        }
    }

    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4};
        int key = 0;

//        applyProcess(numbersArray, key, (v, k) -> System.out.println(v/k));
        applyProcess(numbersArray, key, (v, k) -> {
            try {
                System.out.println(v/k);
            } catch (ArithmeticException e) {
                System.out.println("Handling exception inside lambda. " + e);
            }
        });
    }
}
