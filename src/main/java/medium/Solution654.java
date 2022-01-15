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
654. Maximum Binary Tree
https://leetcode.com/problems/maximum-binary-tree/
 */
class Solution654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    private TreeNode construct(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int max = 0;
        int index = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        TreeNode root = new TreeNode(max);
        root.left = construct(nums, start, index - 1);
        root.right = construct(nums, index + 1, end);

        return root;
    }

}