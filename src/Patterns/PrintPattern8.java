package Patterns;
/*
 * Print the following:
            A B C D
            A B C D
            A B C D
            A B C D
 */

public class PrintPattern8 {
    public static void main(String[] args) {
        int n = 4, i = 1;
        while(i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print((char) ('A' + j - 1) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}