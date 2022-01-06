package medium;

import java.util.ArrayList;
import java.util.List;

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
class Solution1038 {
    public TreeNode bstToGst(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getSum(root, list);
        convertNode(root, list);
        return root;
    }

    private void convertNode(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        int sum = 0;
        for (int i : list) {
            if (i >= root.val) {
                sum += i;
            }
        }
        root.val = sum;

        convertNode(root.left, list);
        convertNode(root.right, list);
    }

    private void getSum(TreeNode root, List<Integer> integers) {
        if (root == null) {
            return;
        }

        integers.add(root.val);
        getSum(root.left, integers);
        getSum(root.right, integers);

    }
}