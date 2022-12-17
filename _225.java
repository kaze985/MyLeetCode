import java.util.ArrayDeque;
import java.util.Deque;

public class _225 {
}
class MyStack {

    Deque<Integer> queue1;
    Deque<Integer> queue2;

    public MyStack() {
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }

    public void push(int x) {
        queue1.addLast(x);
    }

    public int pop() {
        int size = queue1.size();
        size--;
        // 将 que1 导入 que2 ，但留下最后一个值
        while (size-- > 0) {
            queue2.addLast(queue1.peekFirst());
            queue1.pollFirst();
        }

        int res = queue1.pollFirst();
        // 将 queue2 对象的引用赋给了 queue1 ，此时 queue1，queue2 指向同一个队列
        queue1 = queue2;
        // 如果直接操作 queue2，queue1 也会受到影响，所以为 queue2 分配一个新的空间
        queue2 = new ArrayDeque<>();
        return res;
    }

    public int top() {
        return queue1.peekLast();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */