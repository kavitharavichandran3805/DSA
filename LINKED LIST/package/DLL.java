public class DLL {

    Node head;
    int size;

    DLL() {
        size = 0;
    }

    // INSERTION

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        node.prev = null;
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
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
        newNode.prev = node;
        newNode.next = null;
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
        newNode.next.prev = newNode;
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
        while (node != null) {
            if (node.val == beforeVal) {
                break;
            }
            node = node.next;
        }
        if (node == null) {
            System.out.println("There is no such element " + beforeVal);
            return;
        }
        newNode.next = node.next;
        newNode.next.prev = newNode;
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
        if (head.next == null) {
            head = null;
            return val;
        }
        head = head.next;
        head.prev = null;
        --size;
        return val;

    }

    public int deleteLast() {
        if (head == null) {
            System.out.println("The head is null");
            return -1;
        }
        if (head.next == null) {
            int val = head.val;
            head = null;
            return val;
        }
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        int val = node.next.val;
        node.next = null;
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
        node.next.prev = node;
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
        while (node != null) {
            if (node.val == beforeVal) {
                break;
            }
            node = node.next;
        }
        if (node.next == null || node == null) {
            System.out.println("There is no after element");
            return -1;
        }
        int val = node.next.val;
        node.next = node.next.next;
        node.next.prev = node;
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
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.print("END");
    }

    public class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
