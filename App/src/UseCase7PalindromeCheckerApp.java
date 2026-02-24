/**
 * =================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 *
 * Use case 7 : Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * by using a Deque to compare front and rear elements.
 *
 * Flow:
 * - Insert characters into deque
 * - Remove first & last
 * - Compare until empty
 * - Print result
 *
 * Key Concepts:
 * - Deque (Double Ended Queue)
 * - Front and Rear Access
 * - Optimized Data Handling
 *
 * @author Seetharam
 * @version 7.0
 */
import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {
    /**
     * Application entry point
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "rotor";

        // Create a deque and insert characters
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i)); // insert at rear
        }

        // Compare front and rear until empty or mismatch
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
