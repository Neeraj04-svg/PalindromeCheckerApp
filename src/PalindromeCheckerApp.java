/**
 * =================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =================================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // From UC1: Application Entry
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 2.0");
        System.out.println("System initialized successfully.\n");

        // UC2: Hardcoded Palindrome Logic
        String input = "madam"; // Hardcoded string literal
        boolean isPalindrome = true;

        // Loop only till half of the string length.
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare characters from the front and the back
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }

        // Output the result using if-else
        System.out.println("Checking string: " + input);
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}