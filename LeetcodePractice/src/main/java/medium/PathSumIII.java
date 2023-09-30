package medium;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/path-sum-iii/
 */
public class PathSumIII {
    public int pathSum(TreeNode root, int targetSum) {
        AtomicInteger result = new AtomicInteger(0);
        depthFirstSearch(root, targetSum, result);
        return result.get();
    }

    private void depthFirstSearch(TreeNode root, long target, AtomicInteger totalCountOfPaths) {
        if (root == null) return;
        // consider the current node in the calculation
        findPathWithNodeAsRoot(root, target, totalCountOfPaths);

        // don't consider the current node in the calculation
        depthFirstSearch(root.left, target, totalCountOfPaths);
        depthFirstSearch(root.right, target, totalCountOfPaths);
    }

    private void findPathWithNodeAsRoot(TreeNode root, long remainingSum, AtomicInteger totalCountOfPaths) {
        if (root == null) return;

        if (remainingSum - root.val == 0) {
            totalCountOfPaths.set(totalCountOfPaths.get() + 1);
        }

        findPathWithNodeAsRoot(root.left, remainingSum - root.val, totalCountOfPaths);
        findPathWithNodeAsRoot(root.right, remainingSum - root.val, totalCountOfPaths);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
