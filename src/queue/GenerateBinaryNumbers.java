package queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static String[] generateBinaryNumbers(int n) {
        String[] res = new String[n];
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < n; i++) {
            res[i] = q.poll();
            q.add(res[i] + "0");
            q.add(res[i] + "1");
        }
        // ToDo: Write Your Code Here.
        return res;
    }
}
