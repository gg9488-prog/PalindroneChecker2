# PalindroneChecker2

Use Case 8 (UC8): Linked List Based Palindrome Checker

 Objective
The objective of UC8 is to validate whether a string is a palindrome using a singly linked list, applying efficient traversal and in-place reversal techniques.

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
Convert String to Linked List
  ↓
Find Middle using Fast & Slow Pointer
  ↓
Reverse Second Half of List
  ↓
Compare First Half and Second Half
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
* Singly Linked List
* Node Creation and Traversal
* Fast and Slow Pointer Technique
* In-Place Reversal
* Conditional Statements

Use Case
* Demonstrates advanced data structure usage
* Efficient palindrome checking without extra space
* Applies real-world linked list operations
* Strengthens algorithmic thinking

 UC8 Code
import java.util.Scanner;
class Node {
    char data;
    Node next;
    Node(char data) {
        this.data = data;
        this.next = null;
    }
}
public class PalindroneChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome Checker - UC8 (Linked List)");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        Node head = null, tail = null;
        for (int i = 0; i < clean.length(); i++) {
            Node newNode = new Node(clean.charAt(i));
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null, current = slow;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node first = head;
        Node second = prev;
        boolean isPalindrome = true;
        while (second != null) {
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
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
PalindroneChecker2 - UC8 (Linked List)
Enter a string: madam
"madam" is a palindrome.

Conclusion
UC8 demonstrates an advanced and optimized approach to palindrome checking using linked lists, combining efficient traversal and in-place operations to minimize extra memory usage.

