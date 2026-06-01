package warmup;

public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int pos1 = -1;
        int pos2 = -1;
        int res = words.length;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                pos1 = i;
            }

            if (word.equals(word2)) {
                pos2 = i;
            }

            if (pos1 != -1 && pos2 != -1) {
                res = Math.min(res, Math.abs(pos2 - pos1));
            }
            
        }
        return res;
    }

}
