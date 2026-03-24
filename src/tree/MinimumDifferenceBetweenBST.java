package tree;

import java.util.ArrayList;
import java.util.List;

public class MinimumDifferenceBetweenBST {
    private List<Integer> nodes = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {

        nodes.clear();

        inorderTraversal(root);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < nodes.size(); i++) {
            int nodeDiff = nodes.get(i) - nodes.get(i - 1);
            if (nodeDiff < minDiff) {
                minDiff = nodeDiff;
            }
        }

        return minDiff;
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        nodes.add(node.val);
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        // First test case
        TreeNode example1 = new TreeNode(4);
        example1.left = new TreeNode(2);
        example1.left.left = new TreeNode(1);
        example1.left.right = new TreeNode(3);
        example1.right = new TreeNode(6);

        // Second test case
        TreeNode example2 = new TreeNode(40);
        example2.right = new TreeNode(70);
        example2.right.left = new TreeNode(50);
        example2.right.right = new TreeNode(90);

        MinimumDifferenceBetweenBST solution = new MinimumDifferenceBetweenBST();

        System.out.println(solution.minDiffInBST(example1)); // Expected output: 1
        System.out.println(solution.minDiffInBST(example2)); // Expected output: 10 (40-50)
    }
}
