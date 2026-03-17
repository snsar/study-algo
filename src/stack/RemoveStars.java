package stack;

import java.util.Stack;

public class RemoveStars {
    public String removeStars(String str) {
        // ToDo: Write Your Code Here.
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '*') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        RemoveStars solution = new RemoveStars();
        System.out.println(solution.removeStars("abc*de*f"));  // Output: "abdf"
        System.out.println(solution.removeStars("a*b*c*d"));  // Output: "d"
        System.out.println(solution.removeStars("abcd"));  // Output: "abcd"
    }
}
