# PalindroneChecker2


 Use Case 2 (UC2): Hardcoded Palindrome Checker
 Objective
The objective of UC2 is to check whether a predefined (hardcoded) string is a palindrome without taking user input.
 Running Procedure
1. Save the file as `PalindromeChecker3.java`
2. Open terminal / command prompt
3. Navigate to project folder
4. Compile the program:
javac PalindromeChecker3.java
5. Run the program:
java PalindromeChecker3

 Flow of Project


Start
  ↓
Initialize Hardcoded String
  ↓
Remove Spaces & Convert to Lowercase
  ↓
Reverse String
  ↓
Compare Strings
  ↓
Display Result
  ↓
End



 Topics Covered

* Java Program Structure
* String Handling
* StringBuilder
* Conditional Statements (if-else)
* Basic Logic Building



 Use Case

* Used for testing logic without user input
* Helps beginners understand palindrome logic easily
* Useful in debugging and demonstration


 UC2 Code
public class PalindromeChecker2 {
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




 Sample Output


Palindrome Checker - UC2
"madam" is a palindrome.

Conclusion:
UC2 demonstrates how palindrome logic works using a fixed input. It simplifies testing and helps in understanding the core concept without user interaction.

