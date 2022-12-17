import java.util.HashSet;

public class _349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(x -> x).toArray();
    }
}
