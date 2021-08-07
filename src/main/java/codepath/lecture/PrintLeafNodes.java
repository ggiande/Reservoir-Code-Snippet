package codepath.lecture;
import datastructure.CTreeNode;
/*
          1
      2      6
    3   5  7   8
  4
*/
public class PrintLeafNodes {
    public static void main(String[] args) {
        CTreeNode root = new CTreeNode(
                new CTreeNode(
                        new CTreeNode(
                                new CTreeNode(4),
                                null,
                                3
                        ),
                        new CTreeNode(5),
                        2
                ),
                new CTreeNode(
                        new CTreeNode(7),
                        new CTreeNode(8),
                        6
                ),
                1
        );
        printLeafNodes(root);
//        printRootToLeaf(root, "");
    }

    public static void printLeafNodes (CTreeNode root) {
        // base case
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.val + " ");
        }
        // left
        printLeafNodes(root.left);
        // node
        // System.out.println(root.val + " ");
        // right
        printLeafNodes(root.right);
    }

    public static void printRootToLeaf (CTreeNode root, String acc){
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null){
            System.out.println(acc + String.valueOf(root.val) + " ");
        }
        printRootToLeaf(root.left, acc + String.valueOf(root.val) + " ");
        printRootToLeaf(root.right, acc + String.valueOf(root.val) + " ");
    }
}
// Vikrant Sagar