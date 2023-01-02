import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _17 {
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    Map<Character, String> map = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.equals("")) {
            return result;
        }
        backTracking(digits, 0);
        return result;
    }
    public void backTracking(String digits, int index) {
        if (sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String s = map.get(digits.charAt(index));
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backTracking(digits, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
