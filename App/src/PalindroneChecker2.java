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