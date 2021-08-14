package codepath.lecture;
import datastructure.TreeNode;
import static datastructure.utility.TreeUtility.printInOrder;

public class ConvertSortedArrayToBST {

    public static void main(String[] args) {
        int[] nums = new int[] {-10, -3, 0, 5, 9};
        TreeNode root = new TreeNode();
        root = sortedArrayToBST(nums);
        printInOrder(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        //edgecase for empty arr
        if (nums.length == 0) return null;
        int rootIndex = nums.length/2;
        // set new treenode w middle node as rootIndex
        TreeNode t = new TreeNode(nums[rootIndex]);
        t.left = addNode(0, rootIndex - 1, nums, t);
        t.right = addNode(rootIndex + 1, nums.length - 1, nums, t);
        return t;
    }

    public static TreeNode addNode(int lo, int hi, int[] nums, TreeNode root) {
        // base case to exit
        if (lo > hi) {
            return null;
        }
        int rootIndex = (hi + lo)/2; // THIS WAS THE ISSUE??? BRUH
        // Preorder
        TreeNode t = new TreeNode(nums[rootIndex]); // floating node
        t.left = addNode(lo, rootIndex -1, nums, t);
        // addNode(lo, rootIndex -1, nums, t);
        t.right = addNode(rootIndex + 1, hi, nums, t);
        // addNode(rootIndex + 1, hi, nums, t);
        return t;
    }
}
