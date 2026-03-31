import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class binarytreeConstructionFromArray {

    public static TreeNode constructBinaryTree(String[] a) {
        if (a.length == 0 || a[0].equals("null"))
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(a[0]));
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < a.length) {
            TreeNode cur = q.poll();
            if (i < a.length && !a[i].equals("null")) {
                cur.left = new TreeNode(Integer.parseInt(a[i]));
                q.offer(cur.left);
            }
            i++;
            if (i < a.length && !a[i].equals("null")) {
                cur.right = new TreeNode(Integer.parseInt(a[i]));
                q.offer(cur.right);
            }
            i++;

        }
        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void preorder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(TreeNode root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void levelOrderBFS(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            System.out.print(cur.val + " ");
            if (cur.left != null)
                q.offer(cur.left);
            if (cur.right != null)
                q.offer(cur.right);
        }
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int leftHgt = height(root.left);
        int rightHgt = height(root.right);
        return Math.abs(leftHgt - rightHgt) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int depth(TreeNode root, TreeNode target, int currDepth) {
        if (root == null)
            return -1;
        if (root == target)
            return currDepth;
        int leftDepth = depth(root.left, target, currDepth + 1);
        if (leftDepth != -1)
            return leftDepth;
        return depth(root.right, target, currDepth + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] a = scan.nextLine().trim().split(" ");
        TreeNode root = constructBinaryTree(a);
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("preorder");
        preorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);
        System.out.println();
        System.out.println("level order bfs");
        levelOrderBFS(root);
        scan.close();
    }
}
