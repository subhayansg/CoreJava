package com.subhayan.arrays;

public class SearchInArray {
    static int findMaxElement(int[] arr) {
        int maxElement = 0;
        for(int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxElement)
                maxElement = arr[i];
        }
        return maxElement;
    }

    static int secondMaxElement(int[] arr) {
        int secondMaxElement = 0, maxElement = 0;
        for(int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxElement) {
                secondMaxElement = maxElement;
                maxElement = arr[i];
            }
        }
        return secondMaxElement;
    }

    public static void main(String[] args) {
        int[] arrN = {12,69,31,71,5};
        System.out.println("The max element in array is: " + findMaxElement(arrN));
        System.out.println("The second max element in array is: " + secondMaxElement(arrN));
    }
}
