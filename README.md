# PalindroneChecker2

Use Case 10 (UC10): Case-Insensitive & Space-Ignored Palindrome Checker
Objective
The objective of UC10 is to validate whether a string is a palindrome by ignoring spaces and letter case, making the check more practical and suitable for real-world inputs.

Running Procedure
1. Save the file as `PalindroneChecker2.java`
2. Open terminal / command prompt
3. Navigate to project folder
4. Compile the program:
5. Run the program:

Flow of Project

Start
  ↓
Read Input String
  ↓
Normalize String (Remove Spaces & Convert to Lowercase)
  ↓
Initialize Two Pointers (start & end)
  ↓
Compare Characters
  ↓
Is Equal?
  ↓        ↓
Yes       No
 ↓         ↓
Continue   Not Palindrome
 ↓
Palindrome
  ↓
End

Topics Covered
* Java Program Structure
* Scanner Class (User Input)
* String Preprocessing
* Regular Expressions (`\\s+`)
* Case Conversion (`toLowerCase()`)
* Two-Pointer Technique
* Conditional Statements



Use Case
* Handles real-world inputs with spaces and mixed case
* Improves accuracy of palindrome validation
* Demonstrates string preprocessing techniques
* Useful in text processing applications



 UC10 Code
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
        boolean isPalindrome = true
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

 Sample Output
Palindrome Checker - UC10 (Ignore Case & Spaces)
Enter a string: A man a plan a canal Panama
"A man a plan a canal Panama" is a palindrome.

 Conclusion
UC10 enhances the palindrome checker by incorporating preprocessing techniques, enabling accurate validation of strings regardless of case and spacing.

