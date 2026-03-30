package set;

import java.util.HashSet;

public class CountingElements {
    public int countElements(int[] arr) {
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }

        for (int i : arr) {
            if (hs.contains(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
