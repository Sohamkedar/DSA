package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Creating the following binary tree
                 50
               /    \
             30      70
            / \     /  \
           20  40  60   80
        */

        // Insert elements into the binary tree
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        // Find height of the tree
        System.out.println("Height of the tree: " + tree.findHeight(tree.root));

        // Print leaf nodes
        System.out.print("Leaf nodes: ");
        tree.printLeafNodes(tree.root);
        System.out.println();

        // Print original tree level-wise
        System.out.print("Original tree level-wise: ");
        tree.printLevelOrder(tree.root);
        System.out.println();

        // Find and print mirror image
        tree.mirror(tree.root);
        System.out.print("Mirror image level-wise: ");
        tree.printLevelOrder(tree.root);

        System.out.println();
    }
}
