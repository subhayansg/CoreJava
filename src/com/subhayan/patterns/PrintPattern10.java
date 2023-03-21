package com.subhayan.patterns;
/*
 * Print the following:
            D
            C D
            B C D
            A B C D
 */

public class PrintPattern10 {
    public static void main(String[] args) {
//        int n = 4, i = 1, outerCnt = n;
//        while(i <= n) {
//            int j = 1;
//            int cnt = outerCnt;
//            while (j <= i) {
//                System.out.print((char) ('A' + cnt - 1) + " ");
//                j++;
//                cnt++;
//            }
//            System.out.println();
//            i++;
//            outerCnt--;
        int n = 4, i = 1;
        while(i <= n) {
            int j = 1;
            int cnt = n - i;
            while (j <= i) {
                System.out.print((char) ('A' + cnt) + " ");
                j++;
                cnt++;
            }
            System.out.println();
            i++;
        }
    }

}