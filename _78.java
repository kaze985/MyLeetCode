import java.util.ArrayList;
import java.util.List;

public class _78 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subSet = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, 0);
        return result;
    }
    public void backTracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(subSet));
        if (startIndex >= nums.length) {
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            subSet.add(nums[i]);
            backTracking(nums, i + 1);
            subSet.remove(subSet.size() - 1);
        }
    }
}
