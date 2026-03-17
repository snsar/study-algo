package stack;

import java.util.Stack;

public class RemoveDuplicates {
    public String removeDuplicates(String str) {
        // ToDo: Write Your Code Here.
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!st.isEmpty() && st.peek().equals(c)) {
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
        RemoveDuplicates sol = new RemoveDuplicates();
        System.out.println(sol.removeDuplicates("abbaca"));  // Output: "ca"
        System.out.println(sol.removeDuplicates("azxxzy"));  // Output: "ay"
        System.out.println(sol.removeDuplicates("abba"));    // Output: ""
    }
}
