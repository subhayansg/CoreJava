package com.subhayan.patterns;
/*
 * Print the following:
        A
        B C
        C D E
        D E F G
 */

public class PrintPattern9 {
    public static void main(String[] args) {
        int n = 4, i = 1;
        while(i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print((char) ('A' + i + j - 2) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}