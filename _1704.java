import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class _1704 {
    public boolean halvesAreAlike(String s) {
        int n = 0, m = s.length() / 2;
        char[] chars = {'A', 'E', 'I', 'O', 'U','a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < m; i++) {
            if (Arrays.binarySearch(chars, s.charAt(i)) >= 0) {
                n++;
            }
            if (Arrays.binarySearch(chars, s.charAt(i + m)) >= 0) {
                n--;
            }
        }
        return n == 0;
    }

    public static void main(String[] args) {
        System.out.println(new _1704().halvesAreAlike("Uo"));
    }
}
