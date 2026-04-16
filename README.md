# PalindroneChecker2

 Use Case 13 (UC13): Performance Comparison of Palindrome Algorithms

Objective
The objective of UC13 is to compare the performance of different palindrome checking approaches by measuring their execution time and analyzing efficiency.

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
Run Multiple Algorithms
  ↓
Capture Start Time (nanoTime)
  ↓
Execute Algorithm
  ↓
Capture End Time
  ↓
Calculate Execution Time
  ↓
Display Results
  ↓
End

 Topics Covered
* Java Program Structure
* Scanner Class (User Input)
* String Preprocessing
* System.nanoTime()
* Algorithm Comparison
* Two-Pointer Technique
* Stack Data Structure
* Deque Data Structure

 Use Case
* Helps compare efficiency of different algorithms
* Provides insight into execution time
* Demonstrates practical performance analysis
* Useful for optimizing code

 UC13 Code
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class PalindroneChecker2 {
    public static boolean checkUsingTwoPointer(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean checkUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkUsingDeque(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome Checker - UC13 (Performance Comparison)");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        long start, end;
        start = System.nanoTime();
        boolean result1 = checkUsingTwoPointer(clean);
        end = System.nanoTime();
        long time1 = end - start;
        start = System.nanoTime();
        boolean result2 = checkUsingStack(clean);
        end = System.nanoTime();
        long time2 = end - start;
        start = System.nanoTime();
        boolean result3 = checkUsingDeque(clean);
        end = System.nanoTime();
        long time3 = end - start;
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Result: " + result3 + " | Time: " + time3 + " ns");
        scanner.close();
    }
}

 Sample Output
PalindroneChecker2 - UC13 (Performance Comparison)
Enter a string: racecar
Two Pointer Result: true | Time: 11000 ns
Stack Result: true | Time: 23000 ns
Deque Result: true | Time: 17000 ns


 Conclusion
UC13 demonstrates how to evaluate and compare the performance of different palindrome algorithms, helping developers choose the most efficient approach based on execution time.

