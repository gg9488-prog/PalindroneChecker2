# PalindroneChecker2
 Use Case 4 (UC4): Character Array Based Palindrome Checker

 Objective
The objective of UC4 is to check whether a string is a palindrome by converting it into a character array and using an efficient two-pointer technique.

Running Procedure

1. Save the file as `UseCase4PalindromeCheckerApp.java`
2. Open terminal / command prompt
3. Navigate to project folder
4. Compile the program:

id="yq6k4n"
javac UseCase4PalindromeCheckerApp.java

5. Run the program:

id="0h3m9k"
java UseCase4PalindromeCheckerApp

 Flow of Project
Start
  ↓
Read Input String
  ↓
Remove Spaces & Convert to Lowercase
  ↓
Convert String to Character Array
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
* String Handling
* Character Array (`char[]`)
* Array Indexing
* Two-Pointer Technique
* Looping (`while`)
* Conditional Statements


Use Case

* Efficient palindrome checking using arrays
* Avoids creating extra reversed strings
* Demonstrates optimized logic
* Useful for learning **data structures and algorithms basics**


UC4 Code

import java.util.Scanner;
public class PalindroneChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome Checker - UC4 (Character Array)");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        char[] arr = clean.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (arr[left] != arr[right]) {
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

Palindrome Checker - UC4 (Character Array)
Enter a string: racecar
"racecar" is a palindrome.

 Conclusion
UC4 introduces an optimized approach using character arrays and the two-pointer technique, improving efficiency and demonstrating core data structure concepts.


 