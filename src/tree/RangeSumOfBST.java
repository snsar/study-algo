package tree;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }

        if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        }

        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        }

        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }

    public static void main(String[] args) {
        // Test using the examples provided
        TreeNode example1 = new TreeNode(10);
        example1.left = new TreeNode(5);
        example1.left.left = new TreeNode(3);
        example1.left.right = new TreeNode(7);
        example1.right = new TreeNode(15);
        example1.right.right = new TreeNode(18);

        RangeSumOfBST solution = new RangeSumOfBST();
        System.out.println(solution.rangeSumBST(example1, 7, 15));  // Expected output: 32
    }
}
