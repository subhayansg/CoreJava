package com.subhayan.arrays;

public class ReverseArray {
    static int[] reverseArrayFunc(int[] arr) {
        int len = arr.length;
        int[] reversedArr = new int[len];
        for(int i = 0; i < len; i++) {
            reversedArr[i] = arr[len - 1 - i];
        }
        return reversedArr;
    }

    public static void main(String[] args) {
        int[] arrN = {1,2,3,4,5};
        int[] reversedArray = reverseArrayFunc(arrN);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }
}
