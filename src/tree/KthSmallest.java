package tree;

public class KthSmallest {
    int count = 0;

    int val;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return val;
    }

    private void inOrder(TreeNode node, int k) {
        if (node == null || count > k) {
            return;
        }

        inOrder(node.left, k);
        count++;
        if (count == k) {
            val = node.val;
        }
        inOrder(node.right, k);

    }

    public static void main(String[] args) {
        // Constructing the tree for testing.
        TreeNode example1 = new TreeNode(8);
        example1.left = new TreeNode(3);
        example1.left.left = new TreeNode(1);
        example1.left.right = new TreeNode(6);
        example1.left.right.left = new TreeNode(4);
        example1.left.right.right = new TreeNode(7);
        example1.right = new TreeNode(10);
        example1.right.right = new TreeNode(14);
        example1.right.right.left = new TreeNode(13);

        KthSmallest solution = new KthSmallest();

        // Test the kthSmallest method.
        System.out.println(solution.kthSmallest(example1, 4));  // Expected output: 6
    }
}
