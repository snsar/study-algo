package linkedlist;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l2 != null) {
            tail.next = l2;
        }
        if (l1 != null) {
            tail.next = l1;
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
        MergeTwoLists solution = new MergeTwoLists();

        // Test case 1: L1: 1->2->4, L2: 1->3->4
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        System.out.print("L1: "); printList(l1);
        System.out.print("L2: "); printList(l2);
        System.out.print("Merged: ");
        printList(solution.mergeTwoLists(l1, l2));
    }
}
