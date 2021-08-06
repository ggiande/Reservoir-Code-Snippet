package hackerrank.practice;
import datastructures.Node;
public class PreorderTraversal {
    public static void preOrder(Node root) {
        // base case
        if (root == null) return;
        // root
        System.out.print(root.data + " ");
        // left
        preOrder(root.left);
        //right
        preOrder(root.right);
    }
}