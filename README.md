# PalindroneChecker2

Use Case 9 (UC9): Recursive Palindrome Checker

 Objective
The objective of UC9 is to validate whether a string is a palindrome using recursion, where the function compares characters from both ends and reduces the problem size at each step.

 Running Procedure
1. Save the file as `PalindroneChecker2.java`
2. Open terminal / command prompt
3. Navigate to project folder
4. Compile the program:
5. Run the program:
java PalindroneChecker2

 Flow of Project
Start
  ↓
Read Input String
  ↓
Remove Spaces & Convert to Lowercase
  ↓
Call Recursive Function
  ↓
Compare First and Last Characters
  ↓
Base Condition Reached?
  ↓        ↓
Yes       No
 ↓         ↓
Return True  Recursive Call (move inward)
 ↓
Display Result
  ↓
End

Topics Covered
* Java Program Structure
* Scanner Class (User Input)
* String Handling
* Recursion
* Base Condition
* Call Stack
* Conditional Statements
* 
Use Case
* Demonstrates recursive problem-solving
* Simplifies palindrome logic using function calls
* Useful for understanding divide-and-conquer approach
* Strengthens understanding of call stack behavior

UC9 Code
import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {
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


 Sample Output
Palindrome Checker - UC9 (Recursion)
Enter a string: madam
"madam" is a palindrome.


Conclusion
UC9 demonstrates an elegant and efficient approach to palindrome checking using recursion, highlighting the importance of base conditions and the role of the call stack in problem-solving.

