public class _344 {
    public void reverseString(char[] s) {
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[i + j];
            s[i + j] = temp;
            j -= 2;
        }
    }
}
