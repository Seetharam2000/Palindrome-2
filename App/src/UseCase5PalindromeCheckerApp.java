
        /**
         * =================================================
         * MAIN CLASS - UseCase5PalindromeCheckerApp
         *
         * Use case 5 : Stack-Based Palindrome Checker
         *
         * Description:
         * This class checks whether a given string is a palindrome
         * by using a stack to reverse the characters and then
         * comparing with the original string.
         *
         * Flow:
         * - Push characters into stack
         * - Pop and build reversed string
         * - Compare original and reversed
         * - Print result
         *
         * Key Concepts:
         * - Stack (LIFO principle)
         * - Push Operation
         * - Pop Operation
         * - Reversal Logic
         *
         * @author Seetharam
         * @version 1.0
         */
import java.util.Stack;

        public class UseCase5PalindromeCheckerApp {
            /**
             * Application entry point
             *
             * @param args Command-line arguments
             */
            public static void main(String[] args) {
                // Hardcoded string to check
                String word = "noon";

                // Create a stack of characters
                Stack<Character> stack = new Stack<>();

                // Push each character into the stack
                for (int i = 0; i < word.length(); i++) {
                    stack.push(word.charAt(i));
                }

                // Pop characters to build reversed string
                String reversed = "";
                while (!stack.isEmpty()) {
                    reversed = reversed + stack.pop();
                }

                // Compare original and reversed
                if (word.equals(reversed)) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is not a palindrome.");
                }
            }
        }
