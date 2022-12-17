public class _541 {
    public void reverseString(StringBuilder sb, int start, int end) {
        int j = end - start;
        for (int i = start; i <= (start + end) / 2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(i + j));
            sb.setCharAt(i + j, temp);
            j -= 2;
        }
    }

    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i += 2*k) {
            if (sb.length() - i < k) {
                reverseString(sb, i, sb.length() - 1);
            } else {
                reverseString(sb, i, i + k - 1);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(new _541().reverseStr("abcdefg", 2));
    }
}
