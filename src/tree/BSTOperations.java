package tree;

public class BSTOperations {
    TreeNode root;

    TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }

        if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        } else {
            System.out.println("Duplicate value " + val + " not allowed in BST.");
        }

        return node;
    }

    TreeNode search(TreeNode node, int key) {
        if (node == null || node.val == key) {
            return node;
        }

        if (key < node.val) {
            return search(node.left, key);
        }

        return search(node.right, key);
    }

    // Leaf Node (No Children): If the node is a leaf, it is simply removed from the tree.
    // Node with One Child: If the node has only one child, we replace it with its child, bypassing the node.
    // Node with Two Children: We replace the node's value with the inorder successor (smallest value in the right subtree) and then recursively delete the successor node.
    TreeNode delete(TreeNode node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.val) {
            delete(node.left, key);
        } else if (key > node.val) {
            delete(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            TreeNode successor = minValueNode(node.right);
            node.val = successor.val;
            node.right = delete(node.right, successor.val);
        }
        return node;
    }

    TreeNode minValueNode(TreeNode node) {
        TreeNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Inorder traversal visits the nodes in the order: Left Subtree → Root → Right Subtree.
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.val + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BSTOperations bst = new BSTOperations();

        bst.root = bst.insert(bst.root, 8);
        bst.insert(bst.root, 5);
        bst.insert(bst.root, 3);
        bst.insert(bst.root, 7);
        bst.insert(bst.root, 2);
        bst.insert(bst.root, 4);
        bst.insert(bst.root, 6);
        bst.insert(bst.root, 8); // Attempting to insert duplicate 8

        System.out.println("BST Insertion Completed.");
        System.out.println("Inorder Traversal (Sorted Order): ");
        bst.inorder(bst.root);

        int key = 6; // Searching for key 6
        TreeNode result = bst.search(bst.root, key);
        if (result != null) {
            System.out.println("Key " + key + " found in BST.");
        } else {
            System.out.println("Key " + key + " not found in BST.");
        }

        int keyToDelete = 3;
        System.out.println("\nDeleting node " + keyToDelete + "...");
        bst.root = bst.delete(bst.root, keyToDelete);

        System.out.println("BST after deletion (Inorder Traversal):");
        bst.inorder(bst.root);
    }
}
