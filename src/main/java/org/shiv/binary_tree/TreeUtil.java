package org.shiv.binary_tree;

public class TreeUtil {
    public static void printTree(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println("Root: " + root.data);
        System.out.println("Left: ");
        printTree(root.left);
        System.out.println("Right: ");
        printTree(root.right);
    }
    public static TreeNode sampleTree(){
        TreeNode root = new TreeNode(1);
        TreeNode rootLeft = new TreeNode(2);
        TreeNode rootRight = new TreeNode(3);
        TreeNode rootLeftL1 = new TreeNode(4);
        TreeNode rootRightL1 = new TreeNode(5);
        TreeNode rootLeftR1 = new TreeNode(6);
        TreeNode rootRightR2 = new TreeNode(7);
        root.left = rootLeft;
        root.right = rootRight;

        rootLeft.left = rootLeftL1;
        rootLeft.right = rootRightL1;

        rootRight.left = rootLeftR1;
        rootRight.right = rootRightR2;

        return root;
    }
}
