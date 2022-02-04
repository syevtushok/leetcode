package easy;

import java.util.Objects;

/*
938. Range Sum of BST
https://leetcode.com/problems/range-sum-of-bst/
 */
class TreeNode {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode node = (TreeNode) o;
        return val == node.val && Objects.equals(left, node.left) && Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}

public class Solution938 {
    private int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int val = root.val;
        sum += val < low || val > high ? 0 : val;

        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);

        return sum;
    }
}