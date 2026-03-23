package linkedlist;

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            prev = first;
            head = first.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SwapPairs solution = new SwapPairs();

        // Test case 1: 1->2->3->4
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        System.out.print("Original: "); printList(head1);
        System.out.print("Swapped: "); printList(solution.swapPairs(head1));

        // Test case 2: 1->2->3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        System.out.print("Original: "); printList(head2);
        System.out.print("Swapped: "); printList(solution.swapPairs(head2));
    }
}
