import java.util.ArrayDeque;
import java.util.Deque;

/**
 * =================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =================================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // From UC1: Application Entry
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 7.0");
        System.out.println("System initialized successfully.\n");

        // UC7: Deque-Based Optimized Palindrome Check

        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove from both ends and compare
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break; // Mismatch found
            }
        }

        // Output matching the expected result format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}