import java.util.Scanner;

public class ArmstrongNumber {
    static String ArmstrongOrNot(int num) {
        // 371 = 3*3*3 + 7*7*7 + 1*1*1
        int summedNum = 0, divisor = 10, divident = num;
        while (divident > 0) {
            summedNum += (int) Math.pow(divident%divisor, 3);
            divident /= divisor;
        }
        if (num == summedNum)
            return "an Armstrong number";
        else
            return "not an Armstrong number";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("The given number " + number + " is " + ArmstrongOrNot(number));
    }
}
