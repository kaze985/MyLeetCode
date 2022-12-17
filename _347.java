import java.util.*;

public class _347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(k, (a, b) -> {
            return a.getValue() - b.getValue();
        });
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (queue.size() >= k) {
                if (entry.getValue() > queue.peek().getValue()) {
                    queue.poll();
                    queue.add(entry);
                }
            } else {
                queue.add(entry);
            }
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new _347().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
