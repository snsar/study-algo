package warmup;

// can use two pointer/ stack  and swap vowel
public class ReverseVowels {
    public String reverseVowels(String s) {
//        Deque<Character> stack = new ArrayDeque<>();
//        for (Character ch : s.toCharArray()) {
//            if (isVowel(ch)) {
//                stack.push(ch);
//            }
//        }
        StringBuilder sb = new StringBuilder(s);
//        System.out.println("=== begin debug ===");
//        for (Character ch : stack) {
//            System.out.println(ch);
//        }
//        System.out.println("=== end debug ===");

//        for (int i = 0; i < sb.length(); i++) {
//            if (isVowel(sb.charAt(i)) && !stack.isEmpty()) {
//
//                String replacement = Character.toString(stack.poll());
//                sb.replace(i, i + 1, replacement);
//            }
//        }


//        use two pointer
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            while (left < right && !isVowel(sb.charAt(left))) {
                left++;
            }

            while (left < right && !isVowel(sb.charAt(right))) {
                right--;
            }

            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }
        return sb.toString();
    }

    private boolean isVowel(Character ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }


    public static void main(String[] args) {
        ReverseVowels sol = new ReverseVowels();
        System.out.println(sol.reverseVowels("hello"));  // Expected: 0
    }
}
