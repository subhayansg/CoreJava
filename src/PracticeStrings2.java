import java.util.Scanner;

public class PracticeStrings2 {
    static int getLengthOfString(String str) {
//        int len = 0;
//        for (int i = 0; str.charAt(i) != '\0'; i++) {
//            len++;
//        }
//        return len;
        char[] charArray = str.toCharArray();
        int length = 0;
        for (char c : charArray) {
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Length of the entered string is: " + getLengthOfString(s));
    }
}
