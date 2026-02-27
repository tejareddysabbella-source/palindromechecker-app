import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    // ------------------------------
    // Method 1: Stack Approach
    // ------------------------------
    public static boolean checkUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // ------------------------------
    // Method 2: Deque Approach
    // ------------------------------
    public static boolean checkUsingDeque(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    // ------------------------------
    // Method 3: Two Pointer Approach
    // ------------------------------
    public static boolean checkUsingTwoPointers(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC13: Palindrome Performance Comparison ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        // Stack Timing
        long startStack = System.nanoTime();
        boolean stackResult = checkUsingStack(input);
        long endStack = System.nanoTime();

        // Deque Timing
        long startDeque = System.nanoTime();
        boolean dequeResult = checkUsingDeque(input);
        long endDeque = System.nanoTime();

        // Two Pointer Timing
        long startTwoPointer = System.nanoTime();
        boolean twoPointerResult = checkUsingTwoPointers(input);
        long endTwoPointer = System.nanoTime();

        System.out.println("\n--- Results ---");
        System.out.println("Stack Result: " + stackResult +
                " | Time: " + (endStack - startStack) + " ns");

        System.out.println("Deque Result: " + dequeResult +
                " | Time: " + (endDeque - startDeque) + " ns");

        System.out.println("Two Pointer Result: " + twoPointerResult +
                " | Time: " + (endTwoPointer - startTwoPointer) + " ns");

        scanner.close();
    }
}