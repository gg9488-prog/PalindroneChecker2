import java.util.Scanner;

public class PalindroneChecker2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker - UC3");
        System.out.println("1. String Palindrome");
        System.out.println("2. Number Palindrome");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {

            System.out.print("Enter string: ");
            String str = scanner.nextLine();

            String clean = str.replaceAll("\\s+", "").toLowerCase();
            String rev = new StringBuilder(clean).reverse().toString();

            if (clean.equals(rev)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

        } else if (choice == 2) {

            System.out.print("Enter number: ");
            int num = scanner.nextInt();

            int original = num, rev = 0;

            while (num != 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }

            if (original == rev) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

        } else {
            System.out.println("Invalid Choice");
        }

        scanner.close();
    }
}