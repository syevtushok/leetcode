package medium;

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

/*
1325. Delete Leaves With a Given Value
https://leetcode.com/problems/delete-leaves-with-a-given-value/
 */
class Solution1325 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        System.out.println(root);
        return remove(root, target);
    }

    private TreeNode remove(TreeNode node, int target) {
        if (node == null) {
            return null;
        }

        TreeNode left = remove(node.left, target);
        TreeNode right = remove(node.right, target);

        if (left == null && right == null && node.val == target) {
            return null;
        }
        node.left = left;
        node.right = right;

        return node;
    }
}