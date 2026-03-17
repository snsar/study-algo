package stack;

import java.util.Stack;

public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        // ToDo: Write Your Code Here.
        while (!input.empty()) {
            int tmp = input.pop();
            while (!tmpStack.empty() && tmpStack.peek() > tmp) {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void main(String[] args) {
        SortStack sol = new SortStack();
        // Create a new stack called 'input'
        Stack<Integer> input = new Stack<Integer>();

        // Add elements to the 'input' stack
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        // Display the original input stack
        System.out.println("Input: " + input);

        // Call the sort method to sort the input stack
        Stack<Integer> sortedOutput = sol.sortStack(input);

        // Display the sorted output stack
        System.out.println("Sorted Output: " + sortedOutput);
    }
}
