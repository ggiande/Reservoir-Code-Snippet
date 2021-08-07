package codepath.lecture;
import datastructure.TreeNode;
// Problem 1: Identical Trees
// Given two binary trees, write a function to check if they are the same or not. Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
/*
      1
    /  \
   2    3
         \
          4

      3
     /  \
     1  4
    /
   2
*/
public class IdenticalBinaryTrees {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode q = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        System.out.println(isSameTree(p, q));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // call in order for p and q, then have them compare vals
        if ((p == null) && (q == null)) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val)
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        return false;
    }
}