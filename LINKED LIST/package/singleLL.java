public class singleLL {
    public static void main(String[] args) {
        SLL obj = new SLL();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        obj.insertLast(5);
        obj.insertPosition(2, 7);
        obj.insertAfterVal(8, 1);
        // System.out.println("Delete first : " + obj.deleteFirst());
        // System.out.println("Delete last : " + obj.deleteLast());
        // System.out.println("Delete custom : " + obj.deletePos(2));
        // System.out.println("Delete After a value : " + obj.deleteAfterVal(8));
        System.out.println("Middle " + obj.getMiddle());
        System.out.println("Nth node from end " + obj.getNthFromEnd(2));
        obj.display();
        System.out.println();
        System.out.println("Delete nth node " + obj.deleteNthEnd(2));
        obj.display();
        System.out.println();
        System.out.println("Reverse k- groups ");
        obj.reverseKGroup(3);
        obj.display();
        // System.out.println();
        // obj.displayUsingSize();
    }
}
