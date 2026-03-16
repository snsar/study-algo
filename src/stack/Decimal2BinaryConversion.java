package stack;

import java.util.Stack;

public class Decimal2BinaryConversion {

    public static String decimalToBinary(int num) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        // ToDo: Write Your Code Here.
        while (num != 0) {
            int mod = num % 2;
            st.push(Character.forDigit(mod, 10));
            num /= 2;
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Decimal2BinaryConversion sol = new Decimal2BinaryConversion();
        // Test cases to convert decimal numbers to binary
        System.out.println(sol.decimalToBinary(2));   // Output: 10
        System.out.println(sol.decimalToBinary(7));   // Output: 111
        System.out.println(sol.decimalToBinary(18));  // Output: 10010
    }
}
