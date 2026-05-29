package warmup;

import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> charSet = new HashSet<>();

        for (Character ch : sentence.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                charSet.add(ch);
            }
        }

        return charSet.size() == 26;
    }
}
