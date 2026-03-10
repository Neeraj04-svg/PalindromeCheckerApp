import java.util.Stack;

/**
 * =================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =================================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // From UC1: Application Entry
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 5.0");
        System.out.println("System initialized successfully.\n");

        // UC5: Stack-Based Palindrome Check

        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string and compare with popped characters.
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break; // Mismatch found
            }
        }

        // Output matching the expected result format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}