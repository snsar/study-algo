package set;

import java.util.HashSet;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (Character ch : jewels.toCharArray()) {
            set.add(ch);
        }
        for (Character ch : stones.toCharArray()) {
            if (set.contains(ch)) {
                count++;
            }
        }
        return count;
    }
}
