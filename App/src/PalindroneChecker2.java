import java.util.Scanner;
import java.util.Stack;

public class PalindroneChecker2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker - UC5 (Stack Based)");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String clean = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < clean.length(); i++) {
            stack.push(clean.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < clean.length(); i++) {
            if (clean.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}