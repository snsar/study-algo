package linkedlist;

class DLNode {
    int val;
    DLNode prev;
    DLNode next;

    DLNode(int val) {
        this.val = val;
        prev = next = null;
    }
}

public class DoublyLinkedList {
    DLNode head;

    void traverseForward() {
        DLNode current = head;
        while (current != null) {
            System.out.print(current.val + " ⇄ ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    void traverseBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DLNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        // from tail to head
        while (current != null) {
            System.out.print(current.val + " ⇄ ");
            current = current.prev;
        }

        System.out.println("NULL");
    }


    void insertAtPosition(int val, int position) {
        DLNode newNode = new DLNode(val);
        if (position == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        DLNode prev = head;
        for (int i = 0; i < position - 1 && prev != null; i++) {
            prev = prev.next;
        }

        if (prev == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = prev.next;
        if (prev.next != null) {
            prev.next.prev = newNode;
        }
        prev.next = newNode;
    }

    void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (position == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        DLNode prev = head;

        for (int i = 0; i < position - 1 && prev != null; i++) {
            prev = prev.next;
        }

        if (prev == null || prev.next == null) {
            System.out.println("Invalid position");
            return;
        }
        prev.next = prev.next.next;
        if (prev.next != null) {
            prev.next.prev = prev;
        }

    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Creating initial doubly linked list: 10 ⇄ 20 ⇄ 30 ⇄ NULL
        list.head = new DLNode(10);
        list.head.next = new DLNode(20);
        list.head.next.prev = list.head;
        list.head.next.next = new DLNode(30);
        list.head.next.next.prev = list.head.next;

        System.out.println("Forward Traversal:");
        list.traverseForward();

        // Insert at different positions
        list.insertAtPosition(5, 0);   // Insert at beginning
        list.insertAtPosition(25, 2);  // Insert in middle
        list.insertAtPosition(40, 5);  // Insert at end

        System.out.println("\nDoubly Linked List after Insertions (Forward):");
        list.traverseForward();

        // Delete at different positions
        list.deleteAtPosition(0);  // Delete node at position 0 (beginning)
        list.deleteAtPosition(2);  // Delete node at position 2 (middle)
        list.deleteAtPosition(2);  // Delete node at position 2 (end)

        System.out.println("\nDoubly Linked List after Deletions (Forward):");
        list.traverseForward();
    }
}
