import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {
    Deque<Integer> first;
    Deque<Integer> second;

    public MyStack() {
        first = new ArrayDeque<>();
        second = new ArrayDeque<>();
    }

    public void push(int x) {

        first.add(x);
    }

    public int pop() {
        while (!empty()) {
            second.add(first.removeLast());
        }
        int popped = second.remove();
        while (!second.isEmpty()) {
            first.add(second.removeLast());
        }
        return popped;
    }

    public int top() {
        while (!empty()) {
            second.add(first.removeLast());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.add(second.removeLast());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {

    }
}