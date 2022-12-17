import java.util.Arrays;

public class _242 {
    public boolean isAnagram(String s, String t) {
        int[] ints = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ints[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            ints[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
