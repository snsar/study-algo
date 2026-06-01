package warmup;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] mapS = new int[26];
        int[] mapT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            mapS[s.charAt(i) - 'a']++;
            mapT[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (mapS[i] != mapT[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();
        System.out.println(sol.isAnagram("listen", "silent"));  // Expected: 0
    }
}
