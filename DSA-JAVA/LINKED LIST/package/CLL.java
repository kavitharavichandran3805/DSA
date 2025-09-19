public class CLL {

    Node head;
    int size;

    CLL() {
        size = 0;
    }

    // INSERTION

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            head.next = node;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
        head = node;
        ++size;
    }

    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node node = head;
        while (node.next != head) {
            node = node.next;
        }
        node.next = newNode;
        newNode.next = head;
        ++size;

    }

    public void insertPosition(int pos, int val) {
        if (pos == 0) {
            insertFirst(val);
            return;
        }
        if (pos == size) {
            insertLast(val);
            return;
        }
        Node newNode = new Node(val);
        Node node = head;
        for (int i = 1; i < pos; i++) {
            node = node.next;
        }
        newNode.next = node.next;
        node.next = newNode;
        ++size;
    }

    public void insertAfterVal(int val, int beforeVal) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node node = head;
        do {
            if (node.val == beforeVal) {
                break;
            }
            node = node.next;
        } while (node != head);
        if (node == head) {
            System.out.println("There is no such element " + beforeVal);
            return;
        }
        newNode.next = node.next;
        node.next = newNode;
        ++size;
    }

    // DELETION

    public int deleteFirst() {
        if (head == null) {
            System.out.println("The head is null");
            return -1;
        }
        int val = head.val;
        if (head.next == head) {
            head = null;
            return val;
        }
        Node node = head;
        while (node.next != head) {
            node = node.next;
        }
        node.next = head.next;
        head = head.next;
        --size;
        return val;

    }

    public int deleteLast() {
        if (head == null) {
            System.out.println("The head is null");
            return -1;
        }
        if (head.next == head) {
            int val = head.val;
            head = null;
            return val;
        }
        Node node = head;
        while (node.next.next != head) {
            node = node.next;
        }
        int val = node.next.val;
        node.next = head;
        --size;
        return val;
    }

    public int deletePos(int pos) {
        if (pos == 0) {
            return deleteFirst();

        }
        if (pos == size) {
            return deleteLast();
        }
        Node node = head;
        for (int i = 1; i < pos; i++) {
            node = node.next;
        }
        int val = node.next.val;
        node.next = node.next.next;
        --size;
        return val;
    }

    public int deleteAfterVal(int beforeVal) {
        if (head == null) {
            System.out.println("No value to be deleted");
            return -1;
        }
        if (head.val == beforeVal && head.next == null) {
            System.out.println("There is only one element in the list");
        }
        Node node = head;
        while (node.next != head) {
            if (node.val == beforeVal) {
                break;
            }
            node = node.next;
        }
        if (node.next == head) {
            return deleteFirst();
        }
        if (node.next.next == head) {
            return deleteLast();
        }
        int val = node.next.val;
        node.next = node.next.next;
        --size;
        return val;
    }

    public void displayUsingSize() {
        Node node = head;
        for (int i = 0; i < size; i++) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.print("END");
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.print("HEAD");
    }

    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
