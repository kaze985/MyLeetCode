import java.util.ArrayDeque;
import java.util.Arrays;

public class _503 {
    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        Arrays.fill(result, -1);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.addLast(0);
        for (int i = 1; i < length * 2; i++) {
            while (!stack.isEmpty() && nums[i % length] > nums[stack.getLast()]) {
                result[stack.getLast()] = nums[i % length];
                stack.removeLast();
            }
            stack.addLast(i % length);
        }
        return result;
    }
}
