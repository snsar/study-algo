package stack;

import java.util.Stack;

public class MakeGood {
    public String makeGood(String str) {
        // ToDo: Write Your Code Here.
        Stack<Character> st = new Stack<>();

        for (Character c : str.toCharArray()) {
            if (!st.isEmpty() && Character.toLowerCase(c) == Character.toLowerCase(st.peek()) && !st.peek().equals(c)) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        MakeGood solution = new MakeGood();
        System.out.println(solution.makeGood("AaBCcdEeff"));  // Output: "Bdff"
        System.out.println(solution.makeGood("abBA"));  // Output: ""
        System.out.println(solution.makeGood("s"));  // Output: "s"
    }
}
