import java.util.ArrayDeque;

public class _739 {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        stack.addLast(0);
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < temperatures[stack.getLast()]) {
                stack.addLast(i);
            } else if (temperatures[i] == temperatures[stack.getLast()]) {
                stack.addLast(i);
            } else {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.getLast()]) {
                    result[stack.getLast()] = i - stack.getLast();
                    stack.removeLast();
                }
                stack.addLast(i);
            }
        }
        return result;
    }
}
