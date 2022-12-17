import java.util.LinkedList;

public class _792 {
    public int numMatchingSubseq(String s, String[] words) {
        int i = 0, j = 0, n = 0;
        for (String word : words) {
            while (i != word.length() && j != s.length()) {
                if (word.charAt(i) == s.charAt(j)) {
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            if (i == word.length()) {
                n++;
            }
            i = j = 0;
        }
        return n;
    }
}
