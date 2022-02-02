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
1008. Construct Binary Search Tree from Preorder Traversal
https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/submissions/
 */
class Solution1008 {
    TreeNode root;

    public TreeNode bstFromPreorder(int[] preorder) {
        for (int i : preorder) {
            if (root == null) {
                root = new TreeNode(i);
            } else {
                insertNode(root, i);
            }
        }
        return root;
    }

    private void insertNode(TreeNode node, int element) {
        if (node.val > element) {
            if (node.left != null) {
                insertNode(node.left, element);
            } else {
                node.left = new TreeNode(element);
            }
        } else if (node.val < element) {
            if (node.right == null) {
                node.right = new TreeNode(element);
            } else {
                insertNode(node.right, element);
            }
        }

    }
}