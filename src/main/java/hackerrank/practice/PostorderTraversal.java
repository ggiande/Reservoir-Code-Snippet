package hackerrank.practice;
import datastructure.Node;
public class PostorderTraversal {
    public static void postOrder(Node root) {
        // base case
        if (root == null) return;
        // left
        postOrder(root.left);
        //right
        postOrder(root.right);
        // root
        System.out.print(root.data + " ");
    }
}