# PalindroneChecker2

Use Case 11 (UC11): Object-Oriented Palindrome Service


Objective

The objective of UC11 is to design a reusable palindrome checking service using object-oriented principles by encapsulating the logic within a dedicated class.

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
Create PalindromeChecker Object
  ↓
Call checkPalindrome() Method
  ↓
Process String (Normalize & Compare)
  ↓
Return Result
  ↓
Display Output
  ↓
End


Topics Covered
* Java Program Structure
* Object-Oriented Programming (OOP)
* Encapsulation
* Class and Object
* Method Creation
* String Handling
* Two-Pointer Technique

Use Case
* Promotes reusable and modular code
* Separates logic from execution
* Improves code readability and maintainability
* Demonstrates real-world OOP design



UC11 Code
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

 Sample Output
Palindrome Checker - UC11 (OOP)
Enter a string: racecar
"racecar" is a palindrome.

Conclusion
UC11 demonstrates how object-oriented principles like encapsulation and modular design can be applied to create reusable and maintainable palindrome checking logic.



