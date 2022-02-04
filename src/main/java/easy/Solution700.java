package easy;

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
class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }

    private TreeNode search(TreeNode root, int val) {
        if (root == null) {
            return null;
        } else if (val < root.val) {
            return search(root.left, val);
        } else if (val > root.val) {
            return search(root.right, val);
        } else {
            return root;
        }

    }
}