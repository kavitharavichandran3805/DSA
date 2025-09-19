public class binary_search_trees {

    public class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
        }

        public int getValue() {
            return this.val;
        }

    }

    private Node root;

    public void insert(int value) {
        root = insert(value, root);
    }

    public int getHeight(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    public Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val > node.val) {
            node.right = insert(val, node.right);
        } else if (val < node.val) {
            node.left = insert(val, node.left);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    public void display() {
        display(root, "Root Node : ");
    }

    public void display(Node node, String details) {
        if (node == null)
            return;
        System.out.println(details + node.val);
        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }

    public void populate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }

    public void populateSorted(int[] a) {
        populateSorted(a, 0, a.length);
    }

    public void populateSorted(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        this.insert(a[mid]);
        populateSorted(a, start, mid);
        populateSorted(a, mid + 1, end);
    }

    public void postorder() {
        postorder(root);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val);
    }

    public void inorder() {
        inorder(root);
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.val);
        inorder(node.right);
    }

    public void preorder() {
        preorder(root);
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        int[] a1 = new int[] { 3, 8, 2, 5, 9, 1 };
        binary_search_trees bst1 = new binary_search_trees();
        bst1.populate(a1);
        bst1.display();
        // int[] a2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // binary_search_trees bst2 = new binary_search_trees();
        // bst2.populateSorted(a2);
        // bst2.display();
        bst1.preorder();
        bst1.inorder();
        bst1.postorder();

    }
}