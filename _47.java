import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _47 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> sub = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backTracking(nums);
        return result;
    }
    public void backTracking(int[] nums) {
        if (sub.size() == nums.length) {
            result.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            if (!used[i]) {
                sub.add(nums[i]);
                used[i] = true;
                backTracking(nums);
                used[i] = false;
                sub.remove(sub.size() - 1);
            }
        }
    }
}
