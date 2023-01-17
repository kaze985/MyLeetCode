import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.get(result.size() - 1);
            if (last[1] >= intervals[i][0]) {
                last[1] = Math.max(last[1], intervals[i][1]);
                result.set(result.size() - 1, last);
            } else {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
