package datastructure;
public class CTreeNode {
    public CTreeNode left;
    public CTreeNode right;
    public int val;
    public CTreeNode(){}
    public CTreeNode(int val) {
        this.val = val;
    }
    public CTreeNode(CTreeNode left, CTreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }
}