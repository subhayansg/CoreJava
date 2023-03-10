/*
 * The approach used in this solution is a two-pointer technique, where two pointers are maintained,
 * one at the start of the string and the other at the end of the string.
 * The two pointers move towards each other until they meet in the middle of the string.
 *
 * Test with: A man, a plan, a canal: Panama
 */

import java.util.Locale;
import java.util.Scanner;

public class PalindromeOptimized     {
    static String wordPalinCheckOptimized(String word) {
        String lowerWord = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
        int s = 0, e = lowerWord.length() - 1;
        while(s <= e) {
            if(lowerWord.charAt(s) != lowerWord.charAt(e))
                return " is not a palindrome.";
            else {
                s++;
                e--;
            }
        }
        return " is a palindrome";
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
        System.out.print("Enter a word: ");
        String w = sc.nextLine();
        System.out.println("The given string " + w + wordPalinCheckOptimized(w));

        Solution s = new Solution();
        boolean ans = s.isPalindrome(w);
        System.out.println("More optimized output: " + ans);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("The given number " + n + numberPalinCheck(n));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}