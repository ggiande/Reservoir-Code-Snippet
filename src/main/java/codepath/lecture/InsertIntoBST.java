package codepath.lecture;
import datastructure.TreeNode;
import datastructure.utility.TreeUtility;
public class InsertIntoBST {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode root = insertIntoBST(p, 4);
        TreeUtility.printInOrder(root);
    }
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        // check if root.val is > val
        else if (root.val > val) {
        // go left root.left = insertIntoBST(root.left, val)
            root.left = insertIntoBST(root.left, val);
        // else
        } else {
        // go right -> root.right = insertIntoBST(root.right, val)
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
