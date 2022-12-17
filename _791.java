public class _791 {
    public String customSortString(String order, String s) {
        StringBuilder builder = new StringBuilder(s);
        int k = 0;
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                char c1 = builder.charAt(j);
                if (c == c1) {
                    char temp = builder.charAt(k);
                    builder.setCharAt(k, c1);
                    builder.setCharAt(j, temp);
                    k++;
                }

            }
        }
        return builder.toString();
    }
}
