package easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int depth = 1;

            while (!queue.isEmpty()) {
                int weight = queue.size();
                while (weight > 0) {
                    TreeNode currentNode = queue.remove();
                    if (currentNode.left == null && currentNode.right == null) return depth;
                    if (currentNode.left != null) queue.add(currentNode.left);
                    if (currentNode.right != null) queue.add(currentNode.right);
                    weight--;
                }
                depth++;
            }
        }
        return 0;
    }

    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
}
