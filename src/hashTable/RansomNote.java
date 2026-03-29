package hashTable;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> freq = new HashMap<>();

        for (Character ch : magazine.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : ransomNote.toCharArray()) {
            if (freq.getOrDefault(ch, 0) < 1) {
                return false;
            } else {
                freq.put(ch, freq.get(ch) - 1);
            }
        }
        return true;
    }
}
