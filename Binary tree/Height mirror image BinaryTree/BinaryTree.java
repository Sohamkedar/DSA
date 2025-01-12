package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// Class representing a node in the binary tree
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Class representing a binary tree
public class BinaryTree {
    Node root;

    // Method to insert nodes into the binary tree
    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Method to find the height of the tree
    public int findHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Method to print leaf nodes of the tree
    public void printLeafNodes(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }
        if (root.left != null) {
            printLeafNodes(root.left);
        }
        if (root.right != null) {
            printLeafNodes(root.right);
        }
    }

    // Method to find the mirror image of the tree
    public Node mirror(Node node) {
        if (node == null) {
            return node;
        }

        // Do the subtrees
        Node left = mirror(node.left);
        Node right = mirror(node.right);

        // Swap the left and right pointers
        node.left = right;
        node.right = left;

        return node;
    }

    // Method to print the tree level-wise
    public void printLevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}
