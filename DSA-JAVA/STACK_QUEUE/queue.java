
class myQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;
    int end = 0;

    myQueue(int size) {
        this.data = new int[size];
    }

    myQueue() {
        this(DEFAULT_SIZE);
    }

    void insert(int ele) {
        if (!isFull(end)) {
            data[end++] = ele;
        } else {
            System.out.println("Queue is full");
        }
    }

    int remove() {
        if (!isEmpty(end)) {
            int removed = data[0];
            for (int i = 1; i < end; i++) {
                data[i - 1] = data[i];
            }
            end--;
            return removed;
        }
        return -1;

    }

    boolean isFull(int end) {

        return end >= data.length;
    }

    boolean isEmpty(int end) {

        return end == 0;
    }

    int peek() {
        return data[0];
    }

    void print() {
        System.out.println(end);
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
    }

}

public class queue {
    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.print();

    }
}

class ArrayStack {
    private int[] arr;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Push
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek
    public int peek() {
        if (isEmpty())
            return -1;
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}