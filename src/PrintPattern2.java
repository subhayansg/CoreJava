/*
 * Print the following:
            1 1 1
            2 2 2
            3 3 3
 */
import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        int rows = 3, cols = 3, i = 1;
        while(i <= rows) {
            int j = 1;
            while(j <= cols) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}