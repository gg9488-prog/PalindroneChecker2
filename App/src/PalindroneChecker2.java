import java.util.Scanner;

public class PalindroneChecker2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker - UC10 (Ignore Case & Spaces)");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String clean = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = clean.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}