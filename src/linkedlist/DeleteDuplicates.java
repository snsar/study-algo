package linkedlist;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DeleteDuplicates solution = new DeleteDuplicates();

        // Test case 1: 1 -> 1 -> 2
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        System.out.print("Original: ");
        printList(head1);
        System.out.print("After deleteDuplicates: ");
        printList(solution.deleteDuplicates(head1));

        // Test case 2: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(3);
        System.out.print("Original: ");
        printList(head2);
        System.out.print("After deleteDuplicates: ");
        printList(solution.deleteDuplicates(head2));
    }
}
