import java.util.ArrayList;
import java.util.List;

public class _216 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k, n, 1, 0);
        return result;
    }
    public void backTracking(int k, int n, int startIndex, int sum) {
        if (sum > n) {
            return;
        }
        if (path.size() == k) {
            if (sum == n) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            sum += i;
            backTracking(k, n, i + 1, sum);
            sum -= i;
            path.remove(path.size() - 1);
        }
    }
}
