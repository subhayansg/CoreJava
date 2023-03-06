/*
 * Print the following:
            4 3 2 1
            4 3 2 1
            4 3 2 1
            4 3 2 1
 */
import java.util.Scanner;

public class PrintPattern3 {
    public static void main(String[] args) {
        int rows = 4, cols = 4, i = 1;
        while(i <= rows) {
            int j = 1;
            while(j <= cols) {
                System.out.print((cols - j + 1) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}