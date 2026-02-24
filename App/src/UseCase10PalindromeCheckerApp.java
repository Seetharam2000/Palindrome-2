/**
 * =================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 *
 * Use case 10 : Case-Insensitive & Space-Ignored Palindrome Checker
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * by ignoring spaces and case sensitivity.
 *
 * Flow:
 * - Normalize string (remove spaces, convert to lowercase)
 * - Apply palindrome logic
 * - Display result
 *
 * Key Concepts:
 * - String preprocessing
 * - Regular expressions
 * - equals() method
 *
 * @author Seetharam
 * @version 1.0
 */
public class UseCase10PalindromeCheckerApp {

    // Method to normalize string (remove spaces and lowercase)
    public static String normalize(String str) {
        // Remove all spaces using regex and convert to lowercase
        return str.replaceAll("\\s+", "").toLowerCase();
    }

    // Method to check palindrome
    public static boolean isPalindrome(String str) {
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

    // Main method
    public static void main(String[] args) {
        // Hardcoded string with spaces and mixed case
        String word = "A man a plan a canal Panama";

        // Normalize string
        String normalized = normalize(word);

        // Check palindrome
        if (isPalindrome(normalized)) {
            System.out.println("\"" + word + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }
}
