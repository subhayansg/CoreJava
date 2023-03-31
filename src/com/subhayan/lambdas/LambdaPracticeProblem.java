package com.subhayan.lambdas;

import java.util.Scanner;
import java.util.function.BiConsumer;

interface Iperform {
    public boolean performOperation(int num);
}

public class LambdaPracticeProblem {
    public void performOperation(int type, int num, Iperform iperform) {
        iperform.performOperation(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        int totalNumOfInputs = numberOfInputs * 2;
        int[] inputOptionsArr = new int[totalNumOfInputs];
        for(int i = 0; i < totalNumOfInputs; i++) {
            inputOptionsArr[i] = sc.nextInt();
        }
//        int i1 = sc.nextInt();
//        int t1 = sc.nextInt();
//        int i2 = sc.nextInt();
//        int t2 = sc.nextInt();
//        int i3 = sc.nextInt();
//        int t3 = sc.nextInt();
//        int i4 = sc.nextInt();
//        int t4 = sc.nextInt();
//        int i5 = sc.nextInt();
//        int t5 = sc.nextInt();

        LambdaPracticeProblem l = new LambdaPracticeProblem();
        for(int i = 0; i < totalNumOfInputs; i+=2) {
            int type = inputOptionsArr[i];
            int num = inputOptionsArr[i + 1];
            switch (type) {
                case 1 -> l.performOperation(type, num, n -> {
                    if (n % 2 == 0)
                        return false;
                    else
                        return true;
                });
                case 2 -> l.performOperation(type, num, n -> {
                    if (n == 1)
                        return true;
                    for(int j = 2; j <= n/2; j++) {
                        if (n % j == 0)
                            return false;
                    }
                    return true;
                });
                case 3 -> l.performOperation(type, num, n -> {
                    int newNum = 0, sum = 0, r;
                    while(n > 0) {
                        r = n % 10;
                        sum = (sum * 10) + r;
                        n /= 10;
                    }
                    if (n == newNum)
                        return true;
                    else
                        return false;
                });
            }
        }


    }
}
