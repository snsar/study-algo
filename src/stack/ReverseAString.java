package stack;

import java.util.Stack;

public class ReverseAString {
    public String reverseString(String s) {
        // ToDo: Write Your Code Here.
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            st.push(c);
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseAString rs = new ReverseAString();

        // Test cases
        System.out.println(rs.reverseString("Hello, World!")); // Output: "!dlroW ,olleH"
        System.out.println(rs.reverseString("OpenAI")); // Output: "IAnepO"
        System.out.println(rs.reverseString("Stacks are fun!")); // Output: "!nuf era skcatS"
    }
}
