public class remove_nth_node_fromEnd {

    public static LL.Node remove(LL.Node head){
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
        obj.insertLast(5);
        obj.display();

        LL.Node head = obj.getNode();
        System.out.println(head);
        LL.Node ptr = remove(head);
        printList(ptr);
    }
}
