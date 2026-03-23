package linkedlist;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseList solution = new ReverseList();

        // Test case 1
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(2);
        System.out.print("Original: "); printList(head1);
        System.out.print("Reversed: "); printList(solution.reverseList(head1));

        // Test case 2
        ListNode head2 = new ListNode(7);
        System.out.print("Original: "); printList(head2);
        System.out.print("Reversed: "); printList(solution.reverseList(head2));

        // Test case 3
        ListNode head3 = new ListNode(-1);
        head3.next = new ListNode(0);
        head3.next.next = new ListNode(1);
        System.out.print("Original: "); printList(head3);
        System.out.print("Reversed: "); printList(solution.reverseList(head3));
    }
}
