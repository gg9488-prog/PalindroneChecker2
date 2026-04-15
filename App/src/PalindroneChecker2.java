public class PalindroneChecker2 {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - UC2");

        String original = "madam";

        String cleanString = original.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(cleanString).reverse().toString();

        if (cleanString.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
    }
}