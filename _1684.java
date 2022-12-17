public class _1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        boolean[] allow = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            allow[allowed.charAt(i) - 'a'] = true;
        }

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!allow[word.charAt(i) - 'a']) {
                    n--;
                    break;
                }
            }
        }
        return n;
    }
}
