/**
 * =================================================
 * MAIN CLASS - UseCase1palindromeApp
 *
 * Use case 1 : Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Managment System.
 *
 * At this Stage, the application:
 * -Starts execution from the main() method
 * -Displays a welcome message
 * -Shoes application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @Seetharam Developer
 * &#064;version1
 */

public class Palindromecheckerapp {
    /**
     *Application  entry point
     *
     * This is  first method executed by the JVM
     * when the program starts

     * @Seetharam args Command -Line arguments
     */
    public static void main(String[] args)  {
        // Class declaration


            // Main method - entry point of the program

                // Hardcoded string literal
                String word = "madam";

                // Check if the string is a palindrome
                if (isPalindrome(word)) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is not a palindrome.");
                }
            }

            // Method to check palindrome condition
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
        }





