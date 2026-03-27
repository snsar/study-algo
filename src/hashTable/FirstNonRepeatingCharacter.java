package hashTable;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstNonRepeatingCharacter sol = new FirstNonRepeatingCharacter();
        System.out.println(sol.firstUniqChar("apple"));  // Expected: 0
        System.out.println(sol.firstUniqChar("abcab"));  // Expected: 2
        System.out.println(sol.firstUniqChar("abab"));   // Expected: -1
    }
}
