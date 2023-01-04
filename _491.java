import java.util.ArrayList;
import java.util.List;

public class _491 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subSequence = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracking(nums, 0);
        return result;
    }
    public void backTracking(int[] nums, int startIndex) {
        if (subSequence.size() >= 2) {
            result.add(new ArrayList<>(subSequence));
        }
        if (startIndex >= nums.length) {
            return;
        }

        int[] used = new int[201];
        for (int i = startIndex; i < nums.length; i++) {
            if (!subSequence.isEmpty() && nums[i] < subSequence.get(subSequence.size() - 1)
            || used[nums[i] + 100] == 1) {
                continue;
            }

            used[nums[i] + 100] = 1;
            subSequence.add(nums[i]);
            backTracking(nums, i + 1);
            subSequence.remove(subSequence.size() - 1);
        }
    }

    public static void main(String[] args) {
        new _491().findSubsequences(new int[]{1,2,3,4,5,6,7,8,9,10,1,1,1,1,1});
    }
}
