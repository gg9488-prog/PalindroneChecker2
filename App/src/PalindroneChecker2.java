import java.util.Scanner;

public class PalindroneChecker2 {

    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker - UC9 (Recursion)");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String clean = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(clean, 0, clean.length() - 1);

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}