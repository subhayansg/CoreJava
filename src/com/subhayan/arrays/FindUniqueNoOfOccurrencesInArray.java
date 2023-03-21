package com.subhayan.arrays;

import java.util.Scanner;

public class FindUniqueNoOfOccurrencesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th array element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is: ");
        for(int i: arr)
            System.out.print(i + " ");
        System.out.println();
        boolean allCntUnique = true;
        int[] cntArr = new int[n];
        for(int i = 0; i < n; i++) {
            int cnt = 0, ans = 0;
            for(int j = i + 1; j < n; j++) {
                ans = ans ^ arr[i];
                if(ans == 0) {
                    cnt++;
                }
            }
            cntArr[i] = cnt;
        }
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if (cntArr[i] == cntArr[j]) {
                    allCntUnique = false;
                    break;
                }
            }
        }
        System.out.println("All the elements in the array is unique: " + allCntUnique);
    }
}
