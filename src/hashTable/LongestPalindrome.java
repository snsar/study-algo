package hashTable;

import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int length = 0;
        boolean oddFound = false;
        for (Integer freq : map.values()) {
            if (freq % 2 == 0) {
                length += freq;
            } else {
                length += freq - 1;
                oddFound = true;
            }
        }

        if (oddFound) {
            length++;
        }

        return length;
    }


    public static void main(String[] args) {
        LongestPalindrome sol = new LongestPalindrome();
        System.out.println(sol.longestPalindrome("bananas"));  // Expected output: 5
        System.out.println(sol.longestPalindrome("applepie")); // Expected output: 5
        System.out.println(sol.longestPalindrome("racecar"));  // Expected output: 7
    }
}
