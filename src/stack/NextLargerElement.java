package stack;


import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextLargerElement {
    public List<Integer> nextLargerElement(List<Integer> arr) {
        int n = arr.size();
        Integer[] res = new Integer[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && arr.get(i) >= st.peek()) {
                st.pop();
            }
            res[i] = st.empty() ? -1 : st.peek();
            st.push(arr.get(i));
        }
        return Arrays.asList(res);
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(11, 13, 21, 3);
        List<Integer> arr2 = Arrays.asList(4, 5, 2, 25);
        List<Integer> arr3 = Arrays.asList(13, 7, 6, 12);
        NextLargerElement nge = new NextLargerElement();

        // Find and print the Next Greater Element (NGE) for each list
        System.out.println(nge.nextLargerElement(arr1)); // Output: [13, 21, -1, -1]
        System.out.println(nge.nextLargerElement(arr2)); // Output: [5, 25, 25, -1]
        System.out.println(nge.nextLargerElement(arr3)); // Output: [-1, 12, 12, -1]
    }
}
