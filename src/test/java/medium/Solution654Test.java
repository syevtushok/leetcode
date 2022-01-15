package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution654Test {

    @Test
    void constructMaximumBinaryTree() {
        TreeNode root = new TreeNode(6);
        TreeNode left = new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1)));
        TreeNode right = new TreeNode(5, new TreeNode(0), null);

        root.left = left;
        root.right = right;

        TreeNode actualNode = new Solution654().constructMaximumBinaryTree(new int[]{ 3, 2, 1, 6, 0, 5 });
        assertEquals(root, actualNode);
    }
}