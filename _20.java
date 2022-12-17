import java.util.ArrayDeque;

public class _20 {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    stack.addLast(')');
                    break;
                case '[':
                    stack.addLast(']');
                    break;
                case '{':
                    stack.addLast('}');
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.peekLast() == null || stack.pollLast() != c) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
