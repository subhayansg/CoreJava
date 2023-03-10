import java.util.Scanner;

public class Palindrome {
    static String wordPalinCheck(String word) {
        int len = word.length();
        String palin = "";
        for (int i = len - 1; i >= 0; i--) {
//            char c = word.charAt(i);
            palin += word.charAt(i);
        }
        if (palin.equals(word))
            return " is a palindrome";
        else
            return " not a palindrome";
    }

    static int getNumberOfDigits(int numb) {
        int digits = 0;
        while(numb > 0) {
            numb /= 10;
            digits++;
        }
        return digits;
    }

    static String numberPalinCheck(int num) {
        int newNum = 0, n = num;
        while(n > 0) {
            newNum += (int) ((n % 10) * Math.pow(10, getNumberOfDigits(n) - 1));
            n /= 10;
        }
        if (num == newNum)
            return " is a palindrome number";
        else
            return " is not a palindrome number";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a word: ");
//        String w = sc.nextLine();
//        System.out.println("The given string " + w + wordPalinCheck(w));
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The given number " + n + numberPalinCheck(n));
    }
}
