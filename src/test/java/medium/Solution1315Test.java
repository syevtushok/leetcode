package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1315Test {

    @Test
    void sumEvenGrandparent() {
        TreeNode root = new TreeNode(6);
        TreeNode left = new TreeNode(7,
                new TreeNode(2, new TreeNode(9), null),
                new TreeNode(7, new TreeNode(1), new TreeNode(4)));
        TreeNode right = new TreeNode(8,
                new TreeNode(1), new TreeNode(3, null, new TreeNode(5)));
        root.left = left;
        root.right = right;

        int actual = new Solution1315().sumEvenGrandparent(root);

        assertEquals(18, actual);
    }
}