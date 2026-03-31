import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class _26_treeConstruction {
    public static TreeNode buildTree(String[] arr) {
        if (arr.length == 0 || arr[0].equals("null"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.length) {
            TreeNode current = q.poll();

            if (i < arr.length && !arr[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(current.left);
            }
            i++;

            if (i < arr.length && !arr[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(current.right);
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split("\\s+");

        TreeNode root = buildTree(arr);

        inorder(root); // change to preorder/postorder as needed

        scan.close();
    }
}
