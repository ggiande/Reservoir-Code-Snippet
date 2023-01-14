package codepath.lecture;

import datastructure.TreeNode;

import java.util.ArrayList;

/*
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
*/
public class LevelOrderTraversal {

    public void levelOrder(TreeNode root) {
        levelOrder(root, new ArrayList<>(), 0);
    }

    public void levelOrder(TreeNode root, ArrayList<ArrayList<Integer>> levelTree, int level) {
        // Level is 0
        // Do BFS, then store nodes in a list of lists
        // exit condition
        if (root == null) {
            return;
        }
        // not exit logic to call recursive function, add the root value
        ArrayList<Integer> levelList = levelTree.get(level);
        levelList.add(root.val);
        levelOrder(root.left, levelTree, level + 1);
        levelOrder(root.right, levelTree, level + 1);
    }
}
