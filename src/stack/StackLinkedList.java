package stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class StackLinkedList {
    private ListNode top;

    public StackLinkedList() {
        this.top = null;
    }

    // push
    public void push(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack!");
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        int currentValue = top.val;
        top = top.next;
        return currentValue;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek()); // Output: 30

        System.out.println("Popped: " + stack.pop()); // Output: 30
        System.out.println("Popped: " + stack.pop()); // Output: 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
        stack.pop(); // Popping last element
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}
