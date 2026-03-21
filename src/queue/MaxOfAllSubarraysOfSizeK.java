package queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaxOfAllSubarraysOfSizeK {
    public List<Integer> printMax(int[] arr, int k) {
        List<Integer> result = new ArrayList<Integer>();
        // ToDo: Write Your Code Here.
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // xoa gia tri index out window k
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }

            // xoa gia tri be hon index hien tai o rear deque
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // them vao queue index cua array vao rear cua dequeue
            dq.offer(i);

            // result khi du range window k-1->n
            if (i >= k - 1) {
                result.add(arr[dq.peek()]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MaxOfAllSubarraysOfSizeK s = new MaxOfAllSubarraysOfSizeK();
        int arr[] = {12, 1, 78, 90, 57};
        int k = 3;
        List<Integer> result = s.printMax(arr, k);

        // Print the result array
        System.out.println(result);
    }
}
