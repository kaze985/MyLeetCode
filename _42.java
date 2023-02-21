import java.util.ArrayDeque;

public class _42 {
    public int trap(int[] height) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        stack.addLast(0);
        for (int i = 1; i < height.length; i++) {
            if (height[i] < height[stack.getLast()]) {
                stack.addLast(i);
            } else if (height[i] == height[stack.getLast()]) {
                stack.removeLast();
                stack.addLast(i);
            } else {
                while (!stack.isEmpty() && height[i] > height[stack.getLast()]) {
                    Integer mid = stack.removeLast();
                    if (!stack.isEmpty()) {
                        int h = Math.min(height[stack.getLast()], height[i]) - height[mid];
                        int w = i - stack.getLast() - 1;
                        result += h * w;
                    }
                }
                stack.addLast(i);
            }
        }
        return result;
    }
}
