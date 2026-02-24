/**
 * =================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 *
 * Use case 9 : Recursive Palindrome Checker
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * by using recursion to compare characters from both ends.
 *
 * Flow:
 * - Recursive call compares start & end characters
 * - Base condition exits recursion
 *
 * Key Concepts:
 * - Recursion
 * - Base Condition
 * - Call Stack
 *
 * @author Seetharam
 * @version 9.0
 */
public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        // Base condition: if pointers cross or meet
        if (left >= right) {
            return true;
        }
        // If mismatch found
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        // Recursive call moving inward
        return isPalindrome(str, left + 1, right - 1);
    }

    // Main method
    public static void main(String[] args) {
        String word = "madam"; // Hardcoded string

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}