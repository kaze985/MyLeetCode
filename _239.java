import java.util.ArrayDeque;

public class _239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        MonotoneQueue queue = new MonotoneQueue();
        int[] result = new int[nums.length - k + 1];
        int i = 0, j = 0;
        for (; i < k; i++) {
            queue.push(nums[i]);
        }
        result[j] = queue.front();
        for (; i < nums.length; i++) {
            queue.pop(nums[j++]);
            queue.push(nums[i]);
            result[j] = queue.front();
        }
        return result;
    }
}
class MonotoneQueue {

    ArrayDeque<Integer> queue = new ArrayDeque<>();

    void pop(int value) {
        if (!queue.isEmpty()) {
            if (value == queue.peekFirst()) {
                queue.pollFirst();
            }
        }
    }
    void push(int value) {
        while (!queue.isEmpty() && value > queue.peekLast()) {
            queue.pollLast();
        }
        queue.addLast(value);
    }
    int front() {
        return queue.isEmpty() ? 0 : queue.peekFirst();
    }
}