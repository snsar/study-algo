package warmup;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\da-zA-Z]", "").toLowerCase();
        System.out.println("== start debug ===");
        System.out.println(s);
        System.out.println("== End debug ==");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome sol = new ValidPalindrome();
        System.out.println(sol.isPalindrome("12321"));  // Expected: 0
    }
}
