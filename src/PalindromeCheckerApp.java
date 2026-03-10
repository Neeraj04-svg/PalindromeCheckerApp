/**
 * =================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =================================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Application Entry
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 3.0");
        System.out.println("System initialized successfully.\n");

        // UC3: Reverse String Based Palindrome Check
        String input = "madam";
        String reversedString = "";

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i); // String Concatenation
        }

        System.out.println("Checking string: " + input);
        System.out.println("Reversed string: " + reversedString);

        // Compare original and reversed strings using equals()
        if (input.equals(reversedString)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}