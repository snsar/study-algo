package hashTable;

import java.util.HashMap;

public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] A) {
        int maxUnique = -1;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : A) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : A) {
            if (maxUnique < num && freq.get(num) == 1) {
                maxUnique = num;
            }
        }
        return maxUnique;
    }

    public static void main(String[] args) {
        LargestUniqueNumber sol = new LargestUniqueNumber();
        System.out.println(sol.largestUniqueNumber(new int[]{5, 7, 3, 7, 5, 8}));  // Expected: 8
        System.out.println(sol.largestUniqueNumber(new int[]{1, 2, 3, 2, 1, 4, 4}));  // Expected: 3
        System.out.println(sol.largestUniqueNumber(new int[]{9, 9, 8, 8, 7, 7}));   // Expected: -1
    }
}
