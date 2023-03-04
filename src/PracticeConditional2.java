// find radix of a number
// find a given year is leap year or not

import java.util.Scanner;


public class PracticeConditional2 {
    static String leapYearOrNot(int year) {
        if (year%100 == 0)
            if (year%400 == 0)
                return "A leap year";
            else
                return "Not a leap year";
        else if (year%4 == 0)
            return "A leap year";
        else
            return "Not a leap year";
    }

//    static

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int yr = sc.nextInt();
        System.out.println("The given year is: " + leapYearOrNot(yr));
    }
}
