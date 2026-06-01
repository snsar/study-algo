package warmup;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] mapS = new int[26];
        int[] mapT = new int[26];
        for (Character ch : s.toCharArray()) {
            mapS[ch - 'a']++;
        }

        for (Character ch : t.toCharArray()) {
            mapT[ch - 'a']++;
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
