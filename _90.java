import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _90 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subSet = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backTracking(nums, 0);
        return result;
    }
    public void backTracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(subSet));
        if (startIndex >= nums.length) {
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
                continue;
            }
            subSet.add(nums[i]);
            used[i] = true;
            backTracking(nums, i + 1);
            used[i] = false;
            subSet.remove(subSet.size() - 1);
        }
    }
}
