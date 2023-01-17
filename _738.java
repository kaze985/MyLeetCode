public class _738 {
    public int monotoneIncreasingDigits(int n) {
        StringBuilder s = new StringBuilder(String.valueOf(n));
        int flag = s.length();
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i - 1) > s.charAt(i)) {
                flag = i;
                s.setCharAt(i - 1, (char) (s.charAt(i - 1) - 1));
            }
        }
        for (int i = flag; i < s.length(); i++) {
            s.setCharAt(i, '9');
        }
        return Integer.parseInt(s.toString());
    }
}
