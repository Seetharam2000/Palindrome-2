
        public class UseCase8PalindromeCheckerApp {

            // Node class for singly linked list
            static class Node {
                char data;
                Node next;
                Node(char data) {
                    this.data = data;
                    this.next = null;
                }
            }

            // Method to convert string into linked list
            public static Node buildLinkedList(String word) {
                Node head = null;
                Node tail = null;
                for (int i = 0; i < word.length(); i++) {
                    Node newNode = new Node(word.charAt(i));
                    if (head == null) {
                        head = newNode;
                        tail = newNode;
                    } else {
                        tail.next = newNode;
                        tail = newNode;
                    }
                }
                return head;
            }

            // Method to reverse a linked list
            public static Node reverse(Node head) {
                Node prev = null;
                Node current = head;
                while (current != null) {
                    Node nextNode = current.next;
                    current.next = prev;
                    prev = current;
                    current = nextNode;
                }
                return prev;
            }

            // Method to check palindrome using linked list
            public static boolean isPalindrome(Node head) {
                if (head == null || head.next == null) return true;

                // Find middle using fast & slow pointer
                Node slow = head;
                Node fast = head;
                while (fast.next != null && fast.next.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }

                // Reverse second half
                Node secondHalf = reverse(slow.next);

                // Compare halves
                Node firstHalf = head;
                Node temp = secondHalf;
                boolean palindrome = true;
                while (temp != null) {
                    if (firstHalf.data != temp.data) {
                        palindrome = false;
                        break;
                    }
                    firstHalf = firstHalf.next;
                    temp = temp.next;
                }

                return palindrome;
            }

            // Main method
            public static void main(String[] args) {
                String word = "radar"; // Hardcoded string

                Node head = buildLinkedList(word);

                if (isPalindrome(head)) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is not a palindrome.");
                }
            }
        }
