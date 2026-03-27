package hashTable;

import java.util.HashMap;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (Character ch : text.toCharArray()) {
            if (ch == 'a' || ch == 'b' || ch == 'l' || ch == 'o' || ch == 'n') {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            }
        }

        int freqB = freq.getOrDefault('b', 0);
        int freqA = freq.getOrDefault('a', 0);
        int freqL = freq.getOrDefault('l', 0) / 2;
        int freqO = freq.getOrDefault('o', 0) / 2;
        int freqN = freq.getOrDefault('n', 0);

        return Math.min(Math.min(Math.min(freqB, freqA), Math.min(freqL, freqO)), freqN);
    }
}
