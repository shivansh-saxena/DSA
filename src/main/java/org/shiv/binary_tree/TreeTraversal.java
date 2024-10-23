package org.shiv.binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal {
    /*
    DFS -> Goes into depth of tree
    BFS -> Goes level wise 1,2,3,4,5
     */
    // L + R -> Left Root Right
    public static void inOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    // + L  R -> Root Left Right
    public static void preOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // L R + -> Left Right Root
    public static void postOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public List<Integer> preorder(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if (root == null){
            return output;
        }
        output.add(root.data);
        output.addAll(preorder(root.left));
        output.addAll(preorder(root.right));
        return output;
    }

    public List<Integer> inorder(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if (root == null){
            return output;
        }
        output.addAll(inorder(root.left));
        output.add(root.data);
        output.addAll(inorder(root.right));
        return output;
    }

    public List<Integer> postorder(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if (root == null){
            return output;
        }
        output.addAll(postorder(root.left));
        output.addAll(postorder(root.right));
        output.add(root.data);
        return output;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i=0;i<size;i++){
                TreeNode tmp = queue.poll();

                levelList.add(tmp.data);
                if(tmp.left != null){
                    queue.add(tmp.left);
                }
                if(tmp.right != null){
                    queue.add(tmp.right);
                }
            }
            ans.add(levelList);
        }
        return ans;
    }

}
