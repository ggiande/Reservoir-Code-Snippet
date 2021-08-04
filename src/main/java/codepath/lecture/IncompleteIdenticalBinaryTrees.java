package codepath.lecture;

public class IncompleteIdenticalBinaryTrees {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode q = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        System.out.println(isSameTree(p, q));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        inOrder(p);
        return false;
    }

    private static void inOrder(TreeNode root) {
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val + " ");
        inOrder(root.right);


//        if (p == null && q == null){
//            return true;
//        }
//        // left
//        inOrder(p.left);
//        inOrder(q.left);
//        // root
//        System.out.println(p.val + " ");
//        // right
//        inOrder(p.right);
//        inOrder(q.right);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (){}
    TreeNode (int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
