import java.util.Arrays;
import java.util.Comparator;

public class _435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int nonCrossInterval = 1;
        int minRight = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= minRight) {
                nonCrossInterval++;
                minRight = intervals[i][1];
            }
        }
        return intervals.length - nonCrossInterval;
    }
}
