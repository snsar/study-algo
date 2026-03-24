package tree;

public class TreeTraversal {

    // Inorder traversal visits the nodes in the order: Left Subtree → Root → Right Subtree.
    // In a Binary Search Tree (BST), this traversal returns the nodes in ascending sorted order.
    void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);
    }

    // Preorder traversal visits nodes in the order: Root → Left Subtree → Right Subtree.
    // This method is useful for cloning trees or for generating a prefix expression from an expression tree.
    void preorder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder traversal visits nodes in the order: Left Subtree → Right Subtree → Root.
    // This approach is useful for deleting trees or evaluating postfix expressions.
    void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val + " ");
    }

    public static void main(String[] args) {
        // Create a sample BST:
        //         8
        //       /   \
        //      3     10
        //     / \      \
        //    1   6      14
        //       /
        //      4
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.right.right = new TreeNode(14);

        TreeTraversal it = new TreeTraversal();
        System.out.println("Inorder Traversal (Sorted Order):");
        it.inorder(root); // Expected output: 1 3 4 6 8 10 14

        System.out.println("Preorder Traversal (Root First):");
        it.preorder(root); //8 3 1 6 4 10 14

        System.out.println("Postorder Traversal (Root Last):");
        it.postorder(root); // Expected output: 1 4 6 3 14 10 8
    }
}
