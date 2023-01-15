import java.util.ArrayList;
import java.util.List;

public class _763 {
    public List<Integer> partitionLabels(String s) {
        int start = 0;
        int end = 0;
        boolean[] isSearched = new boolean[26];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int ix = s.charAt(i) - 'a';
            if (!isSearched[ix]) {
                int index = s.lastIndexOf(s.charAt(i));
                if (index > end) {
                    end = index;
                }
                isSearched[ix] = true;
            }
            if (i == end) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }
        return result;
    }
}
