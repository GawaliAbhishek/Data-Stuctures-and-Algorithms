import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> q1;
    static Queue<Integer> q2;

    public StackUsingQueue() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {

        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;

    }

    public int pop() {

        if (q1.isEmpty())
            return -1;

        return q1.poll();

    }

    public int top() {
        if (q1.isEmpty())
            return -1;

        return q1.peek();

    }

    public boolean empty() {

        return q1.isEmpty();
    }

}
