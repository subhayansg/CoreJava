package com.subhayan.patterns;
/*
 * Print the following:
        1 2 3
        4 5 6
        7 8 9
 */

public class PrintPattern4 {
    public static void main(String[] args) {
        int rows = 3, cols = 3, i = 1, k = 0;
        while(i <= rows) {
            int j = 1;
            while(j <= cols) {
                System.out.print((j + k * cols) + " ");
                j++;
            }
            System.out.println();
            i++;
            k++;
        }
    }

}