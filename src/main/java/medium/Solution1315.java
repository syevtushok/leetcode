package medium;

import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution1315 {
    public int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.val % 2 == 0) {
            if (root.left != null) {
                sum(root.left.left, root.left.right);
            }
            if (root.right != null) {
                sum(root.right.right, root.right.left);
            }
        }

        sumEvenGrandparent(root.left);
        sumEvenGrandparent(root.right);

        return sum;
    }

    private void sum(TreeNode left, TreeNode right) {
        sum += left == null ? 0 : left.val;
        sum += right == null ? 0 : right.val;
    }
}