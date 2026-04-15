# PalindroneChecker2

 Use Case 3 (UC3):
Objective
The objective of UC3 is to create a menu-driven application that allows the user to check both string and number palindromes.

 Running Procedure

1. Save the file as `PalindromeChecker3.java`
2. Open terminal / command prompt
3. Navigate to project folder
4. Compile the program:

id="u0w4ec"
javac PalindromeChecker2.java
5. Run the program:
id="cbux8x"
java PalindromeChecker3

 Flow of Project

id="o4wrh1"
Start
  ↓
Display Menu (1.String  2.Number)
  ↓
Read Choice
  ↓
Is Choice = 1?
  ↓        ↓
Yes       No
 ↓         ↓
String     Is Choice = 2?
Check        ↓
 ↓         Yes → Number Check
 ↓         No → Invalid Choice
Display Result
  ↓
End

 Topics Covered

* Java Program Structure
* Scanner Class (User Input)
* String Handling
* StringBuilder
* Conditional Statements (if-else)
* Loops (while)
* Menu-driven Programming

 Use Case

* Allows multiple operations in a single program
* Improves user interaction
* Demonstrates menu-driven logic
* Can be extended into advanced applications



 UC3 Code

java id="5fqgh1"
import java.util.Scanner;

public class PalindromeChecker2 {
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

 Sample Output

 Case 1:

id="k1h6hz"
Palindrome Checker - UC3
1. String Palindrome
2. Number Palindrome
Enter your choice: 1
Enter string: madam
Palindrome


 Case 2:

id="8r9qfw"
Enter your choice: 2
Enter number: 121
Palindrome

Conclusion
UC3 enhances the application by introducing a menu-driven approach, allowing users to perform multiple palindrome checks in a single program.


 