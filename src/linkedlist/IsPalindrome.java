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

        while (tail != head && head.next != null && tail.prev != null) {
            if (tail.val != head.val) {
                return false;
            }
            tail = tail.prev;
            head = head.next;
        }
        return true;
    }
}
