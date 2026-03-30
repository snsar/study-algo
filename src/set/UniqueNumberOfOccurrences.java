package set;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for (Integer i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (Integer i : freq.values()) {
            if (!hs.add(i)) {
                return false;
            }
        }

        return true;
    }
}
