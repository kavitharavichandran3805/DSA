public class circluarLL {
    public static void main(String[] args) {
        CLL obj = new CLL();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        obj.insertLast(5);
        obj.insertPosition(2, 7);
        obj.insertAfterVal(8, 1);
        System.out.println("Delete first : " + obj.deleteFirst());
        System.out.println("Delete last : " + obj.deleteLast());
        System.out.println("Delete custom : " + obj.deletePos(2));
        System.out.println("Delete After a value : " + obj.deleteAfterVal(1));
        obj.display();
    }
}
