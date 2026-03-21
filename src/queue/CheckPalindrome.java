package queue;

import java.util.Deque;
import java.util.LinkedList;

public class CheckPalindrome {
    public static boolean checkPalindrome(String s) {
        Deque<Character> dq = new LinkedList<>();
        for (Character i : s.toLowerCase().toCharArray()) {
            if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
                dq.offer(i);
            }
        }
        while (!dq.isEmpty()) {
            Character last = dq.pollLast();
            boolean isEmpty = dq.isEmpty();
            if (isEmpty) {
                return true;
            }
            Character fist = dq.pollFirst();

            if (!last.equals(fist)) {
                return false;
            }
        }
        return true;
    }
}
