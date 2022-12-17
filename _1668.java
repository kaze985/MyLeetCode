public class _1668 {
    public int maxRepeating(String sequence, String word) {
        StringBuilder builder = new StringBuilder(word);
        int k = 0;
        for ( ; sequence.contains(builder); k++) {
            builder.append(word);
        }
        return k;
    }

    public static void main(String[] args) {
        int i = new _1668().maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba");
        System.out.println(i);
    }
}
