/**
 * =================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 *
 * Use case 12 : Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This program demonstrates the Strategy Pattern by allowing
 * different palindrome checking algorithms (Stack, Deque) to be
 * chosen dynamically at runtime.
 *
 * Flow:
 * - Define PalindromeStrategy interface
 * - Implement StackStrategy and DequeStrategy
 * - Inject strategy at runtime
 *
 * Key Concepts:
 * - Interface
 * - Polymorphism
 * - Strategy Pattern
 *
 * @author Seetharam
 * @version 1.0
 */

import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

// Strategy interface
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return str.equals(reversed);
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context class
class PalindromeChecker {
    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isPalindrome(String str) {
        return strategy.checkPalindrome(str);
    }
}

// Main application
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "level"; // Hardcoded string

        // Use Stack strategy
        PalindromeChecker stackChecker = new PalindromeChecker(new StackStrategy());
        System.out.println("Using StackStrategy: " +
                (stackChecker.isPalindrome(word) ? word + " is a palindrome." : word + " is not a palindrome."));

        // Use Deque strategy
        PalindromeChecker dequeChecker = new PalindromeChecker(new DequeStrategy());
        System.out.println("Using DequeStrategy: " +
                (dequeChecker.isPalindrome(word) ? word + " is a palindrome." : word + " is not a palindrome."));
    }
}
