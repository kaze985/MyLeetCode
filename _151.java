import java.util.Arrays;

public class _151 {
    public String reverseWords(String s) {
        StringBuilder builder = removeSpace(s);
        reverseString(builder,0, builder.length() - 1);
        reverseEachWord(builder);
        return builder.toString();
    }

    private StringBuilder removeSpace(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') {
            start++;
        }
        while (s.charAt(end) == ' ') {
            end--;
        }
        StringBuilder builder = new StringBuilder();
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || builder.charAt(builder.length() - 1) != ' ') {
                builder.append(c);
            }
            start++;
        }
        return builder;
    }

    public void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = sb.length() - 1;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                end = i - 1;
                reverseString(sb, start, end);
                start = i + 1;
            }
        }
        reverseString(sb, start, sb.length() - 1);
    }
}
