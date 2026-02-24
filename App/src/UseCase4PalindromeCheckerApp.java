/**
 * =================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 *
 * Use case 4 : Character Array Based Palindrome Check
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * by converting it into a character array and using the
 * two-pointer technique for comparison.
 *
 * Flow:
 * - Convert string to char[]
 * - Use two-pointer approach
 * - Compare start & end characters
 * - Display result
 *
 * Key Concepts:
 * - Character Array (char[])
 * - Array Indexing
 * - Two-Pointer Technique
 * - Time Complexity Awareness
 *
 * @author Seetharam
 * @version 1.0
 */
public class UseCase4PalindromeCheckerApp {
    /**
     * Application entry point
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "racecar";

        // Convert string to character array
        char[] chars = word.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}





