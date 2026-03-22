package linkedlist;

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//    }
//}

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        // TODO: Write your code here
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ReverseList solution = new ReverseList();

        // Test case 1
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(2);
        printList(solution.reverseList(head1)); // Expected Output: 2 5 3

        // Test case 2
        ListNode head2 = new ListNode(7);
        printList(solution.reverseList(head2)); // Expected Output: 7

        // Test case 3
        ListNode head3 = new ListNode(-1);
        head3.next = new ListNode(0);
        head3.next.next = new ListNode(1);
        printList(solution.reverseList(head3)); // Expected Output: 1 0 -1
    }
}
