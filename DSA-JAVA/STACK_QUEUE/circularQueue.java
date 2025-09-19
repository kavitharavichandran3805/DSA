
class dynamicQueue extends cqueue {

    dynamicQueue(int size) {
        this.data = new int[size];
    }

    dynamicQueue() {
        this(DEFAULT_SIZE);
    }

    @Override
    int insert(int ele) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(ele);
    }

}

class cqueue {
    protected int[] data;
    static final int DEFAULT_SIZE = 5;
    int end = 0, front = 0, size = 0;

    cqueue(int size) {
        this.data = new int[size];
    }

    cqueue() {
        this(DEFAULT_SIZE);
    }

    int insert(int ele) {
        if (!isFull()) {
            data[end++] = ele;
            end = end % data.length;
            size++;

        } else {
            System.out.println("Queue is full");
        }
        return 1;
    }

    int remove() {
        if (!isEmpty()) {
            int removed = data[front++];
            front = front % data.length;
            size--;
            return removed;

        } else {
            System.out.println("Queue is empty");
        }
        return -1;
    }

    boolean isFull() {

        return size == data.length;
    }

    boolean isEmpty() {

        return size == 0;
    }

    int peek() {
        return data[front];
    }

    void print() {
        System.out.println(front + " " + end);
        int i = front;
        do {
            System.out.println(data[i]);
            i++;
            i = i % data.length;
            System.out.println(i);

        } while (i != end);

    }
}

public class circularQueue {
    public static void main(String[] args) {
        dynamicQueue q = new dynamicQueue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(4);
        // System.out.println(q.remove());
        // System.out.println(q.peek());
        q.print();
        System.out.println("After removing");
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.insert(111);
        q.print();
    }
}