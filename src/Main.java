/*
 * UC7: Deque-Based Optimized Palindrome Checker
 * Palindrome Checker App
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Initialize deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (Deque check).");
        } else {
            System.out.println(input + " is NOT a Palindrome (Deque check).");
        }

        System.out.println("Program execution completed.");
    }
}