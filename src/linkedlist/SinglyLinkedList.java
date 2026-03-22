package linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedList {
    ListNode head;

    void traverse() {
        ListNode current = head;
        while (current != null) {
            System.out.println("value current " + current.val);
            current = current.next;

        }
    }

    void insertAtPosition(int val, int position) {
        ListNode newNode = new ListNode(val);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode prev = head;

        for (int i = 0; i < position - 1 && prev != null; i++) {
            prev = prev.next;
        }

        if (prev == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = prev.next;
        prev.next = newNode;
    }

    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        ListNode prev = head;

        for (int i = 0; i < position - 1 && prev != null; i++) {
            prev = prev.next;
        }

        if (prev == null || prev.next == null) {
            System.out.println("Position invalid");
            return;
        }

        prev.next = prev.next.next;
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Creating initial linked list:Node 10 → 20 → 30 → NULL
        list.head = new ListNode(10);
        list.head.next = new ListNode(20);
        list.head.next.next = new ListNode(30);

        System.out.println("Original Linked List:");
        list.traverse();

        // Insert at different positions
        list.insertAtPosition(5, 0);  // Insert 5 at position 0 (beginning)
        list.insertAtPosition(25, 2); // Insert 25 at position 2 (middle)
        list.insertAtPosition(40, 5); // Insert 40 at position 5 (end)

        System.out.println("\nLinked List after Insertions:");
        list.traverse();

        // Delete at different positions
        list.deleteAtPosition(0);
        list.deleteAtPosition(1);
        list.deleteAtPosition(2);

        System.out.println("\nLinked List after Deletions:");
        list.traverse();
    }
}
