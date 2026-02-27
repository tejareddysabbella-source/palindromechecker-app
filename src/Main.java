/*
 * UC6: Queue + Stack Based Palindrome Check
 * Palindrome Checker App
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "racecar";

        // Initialize queue and stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue & push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);  // FIFO
            stack.push(ch); // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (Queue + Stack check).");
        } else {
            System.out.println(input + " is NOT a Palindrome (Queue + Stack check).");
        }

        System.out.println("Program execution completed.");
    }
}