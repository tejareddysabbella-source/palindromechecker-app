/*
 * UC4: Character Array Based Palindrome Check
 * Palindrome Checker App
 */

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "radar";

        // Convert String to character array
        char[] characters = input.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}