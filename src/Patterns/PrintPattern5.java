package Patterns;
/*
 * Print the following:
        1
        2 3
        4 5 6
        7 8 9 10
 */

public class PrintPattern5 {
    public static void main(String[] args) {
        int n = 4, i = 1, cnt = 1;
        while(i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(cnt + " ");
                cnt++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

}