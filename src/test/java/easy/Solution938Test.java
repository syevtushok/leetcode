package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution938Test {

    @Test
    void rangeSumBST() {
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5, new TreeNode(3, null, null), new TreeNode(7, null, null));
        TreeNode right = new TreeNode(15, null, new TreeNode(18, null, null));

        root.left = left;
        root.right = right;

        int actual = new Solution938().rangeSumBST(root, 7, 15);

        assertEquals(32, actual);
    }
}