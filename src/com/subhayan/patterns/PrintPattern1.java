package com.subhayan.patterns;
/*
* First check how many rows are there.
* Then check in each rows, how many columns are there.
* You need to find a relationship between the above two.
* Print the following:
             * * *
             * * *
             * * *
 */

import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of rows: ");
        int rows = sc.nextInt(), i = 1;  // i for row, start for 1st row
        System.out.print("Input the number of columns: ");
        int cols = sc.nextInt();
        while(i <= rows) {
            int j = 1;                   // j for columns, start from 1st column
            while(j <= cols) {
                System.out.print("* ");  // This will print all columns for row 1
                j++;                     // go to next column ...
            }                            // Columns for row 1 is done printing
            System.out.println();        // Go to next row
            i++;                         // row 2 ...
        }
    }

}
