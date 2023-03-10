public class _383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] maga = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            maga[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (maga[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            }
            maga[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
