public class SLL {

    Node head;
    int size;

    SLL() {
        size = 0;
    }

    // INSERTION

    public void insertFirst(int val) {
        Node node = new Node(val);
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
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
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

    public int getNthFromEnd(int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                System.out.println("N value is grater than the length of the linked list");
            }
            fast = fast.next;
        }
        if (fast == null) {
            return head.val;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;

    }

    public int deleteNthEnd(int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                System.out.println("N value is grater than the length of the linked list");
            }
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head.val;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        int value = slow.next.val;
        slow.next = slow.next.next;
        return value;
    }

    public void reverseKGroup(int k) {
        if (k <= 1 || head == null || head.next == null) {
            System.out.println("K is less than or equal to 1");
            return;
        }
        Node curr = head;
        Node prev = null;
        int len = getLength(head);
        int ct = len / k;
        while (ct > 0 && curr != null) {
            Node last = prev;
            Node newLast = curr;
            Node next = curr.next;
            for (int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newLast.next = curr;
            prev = newLast;
            --ct;
        }

    }

    public int getLength(Node head) {
        int len = 1;
        while (head.next != null) {
            head = head.next;
            ++len;
        }
        return len;
    }

    public int getMiddle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
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

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
