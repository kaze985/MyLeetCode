import java.util.HashMap;
import java.util.Map;

public class _454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : nums1) {
            for (int i : nums2) {
                int sum = k + i;
                map.putIfAbsent(sum, 0);
                map.put(sum, map.get(sum) + 1);
            }
        }
        for (int k : nums3) {
            for (int i : nums4) {
                int sum = k + i;
                Integer integer = map.get(-sum);
                if (integer != null) {
                    count += integer;
                }
            }
        }
        return count;
    }
}
