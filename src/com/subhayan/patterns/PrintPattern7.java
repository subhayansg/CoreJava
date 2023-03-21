package com.subhayan.patterns;
/*
 * Print the following:
            1
            2 1
            3 2 1
            4 3 2 1
 */

public class PrintPattern7 {
    public static void main(String[] args) {
        int n = 4, i = 1;
        while(i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i - j + 1 + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}