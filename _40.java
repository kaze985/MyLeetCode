import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates, target, 0, 0, new boolean[candidates.length]);
        return result;
    }
    public void backTracking(int[] candidates, int target, int sum, int startIndex, boolean[] used) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1] && used[i - 1] == false) {
                continue;
            }
            path.add(candidates[i]);
            sum += candidates[i];
            used[i] = true;
            backTracking(candidates, target, sum, i + 1, used);
            used[i] = false;
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }
}
