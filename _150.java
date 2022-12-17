import java.util.ArrayDeque;

public class _150 {
    public int evalRPN(String[] tokens) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        int result, first = 0, second = 0;
        for (String s : tokens) {
            switch (s) {
                case "+" -> {
                    if (stack.peekLast() != null) {
                        second = Integer.parseInt(stack.pollLast());
                    }
                    if (stack.peekLast() != null) {
                        first = Integer.parseInt(stack.pollLast());
                    }
                    result = first + second;
                    stack.addLast(String.valueOf(result));
                }
                case "-" -> {
                    if (stack.peekLast() != null) {
                        second = Integer.parseInt(stack.pollLast());
                    }
                    if (stack.peekLast() != null) {
                        first = Integer.parseInt(stack.pollLast());
                    }
                    result = first - second;
                    stack.addLast(String.valueOf(result));
                }
                case "*" -> {
                    if (stack.peekLast() != null) {
                        second = Integer.parseInt(stack.pollLast());
                    }
                    if (stack.peekLast() != null) {
                        first = Integer.parseInt(stack.pollLast());
                    }
                    result = first * second;
                    stack.addLast(String.valueOf(result));
                }
                case "/" -> {
                    if (stack.peekLast() != null) {
                        second = Integer.parseInt(stack.pollLast());
                    }
                    if (stack.peekLast() != null) {
                        first = Integer.parseInt(stack.pollLast());
                    }
                    result = first / second;
                    stack.addLast(String.valueOf(result));
                }
                default -> stack.addLast(s);
            }
        }
        return Integer.parseInt(stack.peekLast());
    }
}
