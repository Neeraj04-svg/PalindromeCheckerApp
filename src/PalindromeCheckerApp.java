/**
 * =================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =================================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // From UC1: Application Entry
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 9.0");
        System.out.println("System initialized successfully.\n");

        // UC9: Recursive Palindrome Check

        // Define the input string
        String input = "madam";

        // Call the recursive method starting with the outermost indices
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Output matching the expected result format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition 1: If pointers meet or cross, all characters matched
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If characters at current pointers do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call: Move both pointers one step inward
        return check(s, start + 1, end - 1);
    }
}