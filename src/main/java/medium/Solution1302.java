package medium;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/*
1302. Deepest Leaves Sum
https://leetcode.com/problems/deepest-leaves-sum/submissions/
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
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
               "val=" + val +
               ", left=" + left +
               ", right=" + right +
               '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}

public class Solution1302 {

    public int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        treeNodes.add(null);

        int sum = 0;
        int resultSum = 0;
        while (!treeNodes.isEmpty()) {
            TreeNode poll = treeNodes.poll();
            if (poll != null) {
                sum += poll.val;
                if (poll.left != null) {
                    treeNodes.add(poll.left);
                }
                if (poll.right != null) {
                    treeNodes.add(poll.right);
                }
            } else {
                resultSum = sum;
                sum = 0;
                if (!treeNodes.isEmpty()) {
                    treeNodes.add(null);
                }
            }
        }
        return resultSum;
    }


}