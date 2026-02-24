
                /**
                 * =================================================
                 * MAIN CLASS - UseCase6PalindromeCheckerApp
                 *
                 * Use case 6 : Queue + Stack Based Palindrome Check
                 *
                 * Description:
                 * This class checks whether a given string is a palindrome
                 * by demonstrating FIFO vs LIFO using Queue and Stack.
                 *
                 * Flow:
                 * - Enqueue characters into queue
                 * - Push characters into stack
                 * - Compare dequeue vs pop
                 * - Print result
                 *
                 * Key Concepts:
                 * - Queue (FIFO principle)
                 * - Stack (LIFO principle)
                 * - Enqueue & Dequeue operations
                 * - Push & Pop operations
                 * - Logical comparison for palindrome validation
                 *
                 * @author Seetharam
                 * @version 6.0
                 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

                public class UseCase6PalindromeCheckerApp {
                    /**
                     * Application entry point
                     *
                     * @param args Command-line arguments
                     */
                    public static void main(String[] args) {
                        // Hardcoded string to check
                        String word = "level";

                        // Create a queue and a stack
                        Queue<Character> queue = new LinkedList<>();
                        Stack<Character> stack = new Stack<>();

                        // Enqueue and push each character
                        for (int i = 0; i < word.length(); i++) {
                            char ch = word.charAt(i);
                            queue.add(ch);   // enqueue
                            stack.push(ch);  // push
                        }

                        // Compare dequeue vs pop
                        boolean isPalindrome = true;
                        while (!queue.isEmpty() && !stack.isEmpty()) {
                            char fromQueue = queue.remove(); // dequeue
                            char fromStack = stack.pop();    // pop

                            if (fromQueue != fromStack) {
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
