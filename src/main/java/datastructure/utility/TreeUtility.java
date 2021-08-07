package datastructure.utility;

import datastructure.TreeNode;

public class TreeUtility {
    public static void printInOrder (TreeNode root){
        if (root == null) {
            return;
        }
        // left
        printInOrder(root.left);
        // root
        System.out.print(root.val + " ");
        // right
        printInOrder(root.right);
    }
    public static void printPostOrder (TreeNode root){
        if (root == null) {
            return;
        }
        // left
        printInOrder(root.left);
        // right
        printInOrder(root.right);
        // root
        System.out.print(root.val + " ");
    }
    public static void printPreOrder (TreeNode root){
        if (root == null) {
            return;
        }
        // root
        System.out.print(root.val + " ");
        // left
        printInOrder(root.left);
        // right
        printInOrder(root.right);
    }
}
