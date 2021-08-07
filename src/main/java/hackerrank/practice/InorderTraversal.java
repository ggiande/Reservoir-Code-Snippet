package hackerrank.practice;
import datastructure.Node;
public class InorderTraversal {
    public static void inOrder(Node root) {
        // base case
        if (root == null) return;
        // left
        inOrder(root.left);
        // root
        System.out.print(root.data + " ");
        //right
        inOrder(root.right);
    }
}
