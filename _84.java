import java.util.ArrayDeque;

public class _84 {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        int [] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        newHeights[newHeights.length - 1] = 0;
        for (int index = 0; index < heights.length; index++){
            newHeights[index + 1] = heights[index];
        }

        heights = newHeights;

        stack.addLast(0);
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[stack.getLast()]) {
                stack.addLast(i);
            } else if (heights[i] == heights[stack.getLast()]) {
                stack.removeLast();
                stack.addLast(i);
            } else {
                while (!stack.isEmpty() && heights[i] < heights[stack.getLast()]) {
                    Integer mid = stack.removeLast();
                    if (!stack.isEmpty()) {
                        int w = i - stack.getLast() - 1;
                        int h = heights[mid];
                        result = Math.max(result, w * h);
                    }
                }
                stack.addLast(i);
            }
        }
        return result;
    }
}
