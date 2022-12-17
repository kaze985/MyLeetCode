import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            List<Integer> indexes = map.get(nums[i]);
            indexes.add(i);
            map.put(nums[i], indexes);
        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.get(target - nums[i]);
            if (list != null) {
                for (Integer integer : list) {
                    if (integer != i) {
                        ints[0] = i;
                        ints[1] = integer;
                    }
                }
            }
        }
        return ints;
    }
}
