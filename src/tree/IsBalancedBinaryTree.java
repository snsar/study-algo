package tree;

public class IsBalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = depth(node.left);
        if (leftDepth == -1) {
            return -1;
        }

        int rightDepth = depth(node.right);
        if (rightDepth == -1) {
            return -1;
        }
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        // Test example 1
        TreeNode example1 = new TreeNode(3);
        example1.left = new TreeNode(9);
        example1.right = new TreeNode(20);
        example1.right.left = new TreeNode(15);
        example1.right.right = new TreeNode(7);

        // Test example 2
        TreeNode example2 = new TreeNode(1);
        example2.left = new TreeNode(2);
        example2.left.left = new TreeNode(3);
        example2.left.left.left = new TreeNode(4);
        example2.right = new TreeNode(5);

        IsBalancedBinaryTree solution = new IsBalancedBinaryTree();

        System.out.println(solution.isBalanced(example1)); // Expected output: true
        System.out.println(solution.isBalanced(example2)); // Expected output: false
    }
}
