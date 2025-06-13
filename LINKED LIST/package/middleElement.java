
public class middleElement {
    public static int getMiddle(LL.Node head) {
        LL.Node fast = head;
        LL.Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
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

        int mid = getMiddle(head);
        System.out.println(mid);
    }
}
