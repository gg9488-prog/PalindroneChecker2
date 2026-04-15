# PalindroneChecker2

 Use Case 5 (UC5): Stack-Based Palindrome Checker

 Objective
The objective of UC5 is to validate whether a string is a palindrome using a stack data structure, leveraging its LIFO (Last In First Out) behavior to reverse characters.

 Running Procedure
1. Save the file as `UseCase5PalindromeCheckerApp.java`
2. Open terminal / command prompt
3. Navigate to project folder
4. Compile the program:

id="q7k2mr"
javac UseCase5PalindromeCheckerApp.java
5. Run the program:

id="r1y6pw"
java UseCase5PalindromeCheckerApp

Flow of Project
id="f9c4zs"
Start
  ↓
Read Input String
  ↓
Remove Spaces & Convert to Lowercase
  ↓
Push Characters into Stack
  ↓
Pop Characters from Stack
  ↓
Compare with Original String
  ↓
Is Equal?
  ↓        ↓
Yes       No
 ↓         ↓
Palindrome  Not Palindrome
  ↓
End

 Topics Covered
* Java Program Structure
* Scanner Class (User Input)
* String Handling
* Stack Data Structure
* Push and Pop Operations
* Looping (`for`)
* Conditional Statements

 Use Case
* Demonstrates stack-based reversal logic
* Useful for understanding LIFO principle
* Applies data structures in problem solving
* Can be extended to advanced applications

 UC5 Code

import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
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


 Sample Output

id="m7h2vd"
Palindrome Checker - UC5 (Stack Based)
Enter a string: racecar
"racecar" is a palindrome.

Conclusion
UC5 demonstrates how a stack can be used to reverse data and validate palindromes efficiently, reinforcing the understanding of stack operations and data structures.


 