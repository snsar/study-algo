package set;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String str) {
        int maxLength = 0, start = 0, end = 0;

        HashSet<Character> set = new HashSet<>();

        while (end < str.length()) {
            if (!set.contains(str.charAt(end))) {
                set.add(str.charAt(end));
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                set.remove(str.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}
