import java.util.Scanner;

// Find factorial of a number
public class Factorial {
    static int factorial(int num) {
        int fact = num;
        if (num == 0 || num == 1)
            return 1;
        else
            for(int i = 1; i < num ; i++) {
                fact = fact * i;
            }
            return fact;
    }

    static int factorialUsingRecursion(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * factorialUsingRecursion(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Factorial of " + number + ": " + factorialUsingRecursion(number));
    }
}
