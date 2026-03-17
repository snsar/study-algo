package stack;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        // ToDo: Write Your Code Here.
        Stack<String> st = new Stack<>();

        for (String ss : path.split("/")) {
            if (ss.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (!ss.isEmpty() && !ss.equals(".")) {
                st.push(ss);
            }
        }
        return "/" + String.join("/", st);
    }

    public static void main(String[] args) {
        SimplifyPath sol = new SimplifyPath();
        // Test cases
        System.out.println(sol.simplifyPath("/a//b////c/d//././/..")); // Expected output: "/a/b/c"
        System.out.println(sol.simplifyPath("/../")); // Expected output: "/"
        System.out.println(sol.simplifyPath("/home//foo/")); // Expected output: "/home/foo"
    }
}
