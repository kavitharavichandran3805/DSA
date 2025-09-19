import java.util.Stack;

class Queue {
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    public void add(int item) {
        first.push(item);
    }

    public int remove() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int peek = second.peek();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return peek;
    }

    public boolean empty() {
        return first.isEmpty();
    }

}

public class QueueusingStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
