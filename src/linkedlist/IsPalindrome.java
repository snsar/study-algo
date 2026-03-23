package linkedlist;

public class IsPalindrome {
    public boolean isPalindrome(DLNode head) {
        if (head == null) {
            return true;
        }
        DLNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        while (tail != null && head != null && tail != head && tail.next != head) {
            if (tail.val != head.val) {
                return false;
            }
            tail = tail.prev;
            head = head.next;
        }
        
        // Final check for meeting in middle or cross over
        if (tail != null && head != null && tail.val != head.val) {
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome solution = new IsPalindrome();

        // Test case 1: Palindrome 1 <-> 2 <-> 1
        DLNode head1 = new DLNode(1);
        head1.next = new DLNode(2);
        head1.next.prev = head1;
        head1.next.next = new DLNode(1);
        head1.next.next.prev = head1.next;
        System.out.println("Is palindrome (1-2-1): " + solution.isPalindrome(head1)); // true

        // Test case 2: Not a palindrome 1 <-> 2 <-> 3
        DLNode head2 = new DLNode(1);
        head2.next = new DLNode(2);
        head2.next.prev = head2;
        head2.next.next = new DLNode(3);
        head2.next.next.prev = head2.next;
        System.out.println("Is palindrome (1-2-3): " + solution.isPalindrome(head2)); // false

        // Test case 3: Palindrome 1 <-> 2 <-> 2 <-> 1
        DLNode head3 = new DLNode(1);
        head3.next = new DLNode(2);
        head3.next.prev = head3;
        head3.next.next = new DLNode(2);
        head3.next.next.prev = head3.next;
        head3.next.next.next = new DLNode(1);
        head3.next.next.next.prev = head3.next.next;
        System.out.println("Is palindrome (1-2-2-1): " + solution.isPalindrome(head3)); // true
    }
}
