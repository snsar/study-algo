package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    // Constructor to initialize the queues
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public ImplementStackUsingQueue() {
        // ToDo: Write Your Code Here.
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push element x onto the stack
    public void push(int x) {
        // ToDo: Write Your Code Here.
        queue2.add(x);

        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue2;
        queue2 = queue1;
        queue1 = temp;
    }

    public int pop() {
        // ToDo: Write Your Code Here.
        if (!queue1.isEmpty()) {
            return queue1.poll();
        }
        return 0;
    }

    public int top() {
        // ToDo: Write Your Code Here.
        if (!queue1.isEmpty()) {
            return queue1.peek();
        }
        return 0;
    }

    public boolean empty() {
        // ToDo: Write Your Code Here.
        return queue1.isEmpty();
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        ImplementStackUsingQueue myStack = new ImplementStackUsingQueue();
        myStack.push(5);
        myStack.push(10);
        System.out.println(myStack.pop()); // 10
        System.out.println(myStack.top()); // 5
        System.out.println(myStack.pop()); // 5
        System.out.println(myStack.empty());
    }
}
