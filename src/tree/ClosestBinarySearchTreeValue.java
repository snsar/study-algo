package tree;

public class ClosestBinarySearchTreeValue {

    public int closestValue(TreeNode root, double target) {
        int closestVal = root.val;

        while (root != null) {
            if (Math.abs(target - root.val) < Math.abs(target - closestVal)) {
                closestVal = root.val;
            } else if (Math.abs(target - root.val) == Math.abs(target - closestVal)) {
                closestVal = Math.min(root.val, closestVal);
            }

            if (target < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return closestVal;
    }
}
