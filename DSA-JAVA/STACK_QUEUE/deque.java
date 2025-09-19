class CustomDeque {
    private static final int DEFAULT_SIZE = 10;
    int[] data;
    int size = 0;
    int end = 0;

    public CustomDeque(int size) {
        data = new int[size];
    }

    public CustomDeque() {
        this(DEFAULT_SIZE);
    }

    public void addFirst(int item) {
        if (!isFull()) {
            if (!isEmpty()) {
                for (int i = size; i > 0; i--) {
                    data[i] = data[i - 1];
                }
            }
            data[0] = item;
            end = ++size;

        } else {
            System.out.println("Queue is full");
        }
    }

    public void addLast(int item) {
        if (!isFull()) {
            data[end++] = item;
            ++size;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int deleteFisrt() {
        if (!isEmpty()) {
            int removed = data[0];
            for (int i = 1; i < size; i++) {
                data[i - 1] = data[i];
            }
            --size;
            --end;
            return removed;
        } else {
            System.out.println("Queue is empty");
        }
        return 1;
    }

    public int deleteLast() {
        if (!isEmpty()) {
            int removed = data[end - 1];
            --end;
            --size;
            return removed;
        } else {
            System.out.println("Queue is empty");
        }
        return 1;
    }

    public int peekFirst() {
        if (!isEmpty()) {
            return data[0];
        }
        return -1;
    }

    public int peekLast() {
        if (!isEmpty()) {
            return data[end - 1];
        }
        return -1;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.print("END");
            System.out.println();

        }
    }
}

public class deque {
    public static void main(String[] args) {
        CustomDeque dq = new CustomDeque();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(4);
        dq.addFirst(3);
        dq.addLast(7);
        System.out.println(dq.deleteFisrt());
        System.out.println(dq.deleteLast());
        System.out.println(dq.deleteLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.display();

    }
}
