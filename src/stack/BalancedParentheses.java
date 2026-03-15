package stack;

import java.util.Stack;

public class BalancedParentheses {
    public boolean isValid(String s) {
        // ToDo: Write Your Code Here.
        Stack<Character> st = new Stack<>();
        Character open, close;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                open = st.pop();
                System.out.println("open " + open);
                System.out.println("close " + c);
                System.out.println(open == c);
                if ((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        BalancedParentheses bp = new BalancedParentheses();

        // Test cases to verify the solution
        String test1 = "{[()]}";
        String test2 = "{[}]";
        String test3 = "(]";

        System.out.println("Test 1: " + bp.isValid(test1));
//        System.out.println("Test 2: " + bp.isValid(test2));
//        System.out.println("Test 3: " + bp.isValid(test3));
    }
}
