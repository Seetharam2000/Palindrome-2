/**
 * =================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 *
 * Use case 11 : Object-Oriented Palindrome Service
 *
 * Description:
 * This program demonstrates encapsulation by placing
 * palindrome logic inside a dedicated class (PalindromeChecker).
 * The main class simply uses the service to validate a string.
 *
 * Flow:
 * - Create PalindromeChecker class
 * - Expose checkPalindrome() method
 * - Call method from main class
 *
 * Key Concepts:
 * - Encapsulation
 * - Single Responsibility Principle
 *
 * @author Seetharam
 * @version 1.0
 */
public class UseCase11PalindromeCheckerApp {

    // Service class encapsulating palindrome logic
    static class PalindromeChecker {
        // Method to check palindrome using two-pointer technique
        public boolean checkPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

    // Main method
    public static void main(String[] args) {
        String word = "civic"; // Hardcoded string

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        // Use encapsulated method
        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
