import java.util.Scanner;

public class binary_trees {
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public void populate(Scanner scan) {
        System.out.println("Enter the root node ");
        int val = scan.nextInt();
        root = new Node(val);
        populate(scan, root);
    }

    public void populate(Scanner scan, Node node) {
        System.out.println("Do you want to add a left node for " + node.val);
        boolean left = scan.nextBoolean();
        int val;
        if (left) {
            System.out.println("Enter the left node value");
            val = scan.nextInt();
            node.left = new Node(val);
            populate(scan, node.left);
        }
        System.out.println("Do you want to add a right node for " + node.val);
        boolean right = scan.nextBoolean();
        if (right) {
            System.out.println("Enter the right node value");
            val = scan.nextInt();
            node.right = new Node(val);
            populate(scan, node.right);
        }

    }

    public void display() {
        display(this.root, " ");
    }

    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        binary_trees bt = new binary_trees();
        bt.populate(new Scanner(System.in));
        bt.display();
    }

}