package org.shiv.binary_tree;

public class TreeRunner {
    public static void main(String[] args) {
        TreeNode root = TreeUtil.sampleTree();
        System.out.println("Printing Tree");
        TreeUtil.printTree(root);
        System.out.println("In order");
        TreeTraversal.inOrderTraversal(root);
        System.out.println("\nPre order");
        TreeTraversal.preOrderTraversal(root);
        System.out.println("\nPost order");
        TreeTraversal.postOrderTraversal(root);
    }
}
