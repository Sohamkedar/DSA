package BinaryTree;

// Class representing a node in the binary tree
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTree {

    // Root of the binary tree
    TreeNode root;

    // Constructor to create a BinaryTree with a root node
    public BinaryTree(int rootData) {
        root = new TreeNode(rootData);
    }

    // Recursive Inorder Traversal (Left, Root, Right)
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left); // Traverse left subtree
            System.out.print(node.data + " "); // Visit root
            inorderTraversal(node.right); // Traverse right subtree
        }
    }

    // Recursive Preorder Traversal (Root, Left, Right)
    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " "); // Visit root
            preorderTraversal(node.left); // Traverse left subtree
            preorderTraversal(node.right); // Traverse right subtree
        }
    }

    // Recursive Postorder Traversal (Left, Right, Root)
    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left); // Traverse left subtree
            postorderTraversal(node.right); // Traverse right subtree
            System.out.print(node.data + " "); // Visit root
        }
    }

    // Helper function to print the results of different traversals
    public static void printTraversalResults(BinaryTree tree) {
        System.out.println("Inorder Traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.println("Preorder Traversal: ");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.println("Postorder Traversal: ");
        tree.postorderTraversal(tree.root);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a binary tree
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        // Printing the results of different traversals
        printTraversalResults(tree);
    }
}
