package com.subhayan.patterns;
/*
 * Print the following:
        1
        2 3
        3 4 5
        4 5 6 7
 */

public class PrintPattern6 {
    public static void main(String[] args) {
        int n = 4, i = 1;
        while(i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i + j - 1 + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}