import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String clean = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class PalindroneChecker2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("Palindrome Checker - UC11 (OOP)");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}