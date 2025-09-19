
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
