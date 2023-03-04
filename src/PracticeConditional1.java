// find a number id odd or even
import java.util.*;


public class PracticeConditional1 {
    static String findOddOrEven(int num) {
        if (num == 0)
            return "Neither odd nor even";
        if (num%2 == 0)
            return "Even";
        else
            return "Odd";
    }

//    static

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        System.out.println("The given number is: " + findOddOrEven(n));
    }
}
