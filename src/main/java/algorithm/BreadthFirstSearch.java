package algorithm;
import codepath.lecture.datastructures.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
 / \  /  \
3   2 15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
Note:
The range of node's value is in the range of 32-bit signed integer.
*/
public class BreadthFirstSearch {
    // Implemented a pre-defined TreeNode
    public static List<Integer> findAverage(TreeNode root) { // method signature
        Queue<TreeNode> queue = new LinkedList<>(); // used for traversing
        queue.offer(root);
        List<Double> res = new ArrayList<>();

        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
                sum += curr.val;
            }
            res.add(sum/(double)size);
        }
        return res;
    }
}