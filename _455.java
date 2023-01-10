import java.util.Arrays;

public class _455 {
    public int findContentChildren(int[] g, int[] s) {
        int result = 0;
        int cookieIndex = s.length - 1;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = g.length - 1; i >= 0; i--) {
            if (cookieIndex >= 0 && s[cookieIndex] >= g[i]) {
                result++;
                cookieIndex--;
            }
        }
        return result;
    }
}
