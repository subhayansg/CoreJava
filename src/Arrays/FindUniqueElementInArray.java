package Arrays;

import java.util.Scanner;

public class FindUniqueElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th array element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is: ");
        for(int i: arr)
            System.out.print(i + " ");
        System.out.println();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            System.out.println("xor of " + ans + " " + arr[i]);
            ans = ans ^ arr[i];
        }
        System.out.println("The unique element is: " + ans);
    }
}
