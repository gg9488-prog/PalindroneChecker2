# PalindroneChecker2

# 🧩 PalindromeCheckerApp

 Use Case 12 (UC12): Strategy Pattern for Palindrome Algorithms (Advanced)

 Objective
The objective of UC12 is to design a flexible palindrome checking system using the Strategy Pattern, allowing different algorithms (Stack-based and Deque-based) to be selected dynamically at runtime.

Running Procedure
1. Save the file as `PalindroneChecker2.java`
2. Open terminal / command prompt
3. Navigate to project folder
4. Compile the program
5. Run the program:

Flow of Project

Start
  ↓
Display Strategy Options
  ↓
Read User Choice
  ↓
Select Strategy (Stack / Deque)
  ↓
Create PalindromeService Object
  ↓
Input String
  ↓
Apply Selected Strategy
  ↓
Return Result
  ↓
Display Output
  ↓
End

Topics Covered
* Java Program Structure
* Interfaces
* Polymorphism
* Strategy Design Pattern
* Stack Data Structure
* Deque Data Structure
* Object-Oriented Programming

Use Case
* Enables dynamic selection of palindrome algorithms
* Promotes flexible and scalable design
* Demonstrates real-world design pattern usage
* Improves code reusability and maintainability

UC12 Code
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}
class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) {
            stack.push(c);
        }
        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        for (char c : clean.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}
class PalindromeService {
    private PalindromeStrategy strategy;
    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
    public boolean check(String input) {
        return strategy.isPalindrome(input);
    }
}

public class PalindroneChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome Checker - UC12 (Strategy Pattern)");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Choose strategy: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        PalindromeStrategy strategy;
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }
        PalindromeService service = new PalindromeService(strategy);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean result = service.check(input);
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        scanner.close();
    }
}

 Sample Output
Palindrome Checker - UC12 (Strategy Pattern)
1. Stack Strategy
2. Deque Strategy
Choose strategy: 1
Enter a string: racecar
"racecar" is a palindrome.

Conclusion
UC12 demonstrates an advanced and scalable approach to palindrome checking using the Strategy Pattern, enabling dynamic algorithm selection and promoting clean, maintainable code design.

