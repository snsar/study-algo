package stack;

public class StackArrayImpl {
    private int[] stack;
    private int top;
    private int capacity;

    public StackArrayImpl(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow! can't push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed to stack!");
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackArrayImpl stackArray = new StackArrayImpl(5);
        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);

        System.out.println("is empty " + stackArray.isEmpty());

        // peak
        System.out.println("peek " + stackArray.peek());
        // pop
        System.out.println("pop stack");
        stackArray.pop();
        System.out.println("peek " + stackArray.peek());
        System.out.println("pop stack");

        stackArray.pop();
        System.out.println("peek " + stackArray.peek());
        System.out.println("pop stack");

        stackArray.pop();
        System.out.println("peek " + stackArray.peek());

        System.out.println("is empty " + stackArray.isEmpty());


    }
}
