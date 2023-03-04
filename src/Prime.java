import java.util.Scanner;

public class Prime {
    static String findPrimeNum(int num) {
        if (num == 1)
            return " is a prime";
        for(int i = 2; i <= num/2; i++) {
            if (num % i == 0)
                return " is not a Prime";
        }
        return " is a prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("The given number " + number + findPrimeNum(number));
    }
}
