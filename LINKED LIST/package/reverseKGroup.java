public class reverseKGroup {

    public static int getLength(LL.Node node) {
        int len = 1;
        while (node != null) {
            ++len;
            node = node.next;
        }
        return len;
    }

    public static LL.Node reverseKGrp(LL.Node head, int k) {

        if (k <= 1 || head == null || head.next == null) {
            System.out.println("K is less than or equal to 1");
            return head;
        }
        LL.Node curr = head;
        LL.Node prev = null;
        int len = getLength(head);
        int ct = len / k;
        while (ct > 0 && curr != null) {
            LL.Node last = prev;
            LL.Node newLast = curr;
            LL.Node next = curr.next;
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

        return head;

    }

    public static void printList(LL.Node head) {
        LL.Node node = head;
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        LL obj = new LL();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        obj.insertFirst(5);
        obj.insertFirst(6);
        obj.display();

        LL.Node head = obj.getNode();
        // System.out.println(head);
        int k = 3;
        LL.Node ptr = reverseKGrp(head, k);
        printList(ptr);
    }
}
