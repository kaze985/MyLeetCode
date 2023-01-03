import java.util.ArrayList;
import java.util.List;

public class _93 {
    List<String> result = new ArrayList<>();
    List<String> ip = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) return result;
        backTracking(s, 0, 0);
        return result;
    }
    public void backTracking(String s, int startIndex, int deep) {
        if (deep == 3) {
            if (isValid(s, startIndex, s.length() - 1)) {
                ip.add(s.substring(startIndex));
                result.add(String.join(".", ip));
                ip.remove(ip.size() - 1);
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                ip.add(s.substring(startIndex, i + 1));
                backTracking(s, i + 1, deep + 1);
                ip.remove(ip.size() - 1);
            } else {
                break;
            }
        }
    }
    public boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (start != end && s.charAt(start) == '0') {
            return false;
        }
        return Long.parseLong(s.substring(start, end + 1)) <= 255;
    }
}
