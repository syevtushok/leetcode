package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1038Test {

    @Test
    void bstToGst() {
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(1,
                new TreeNode(0, null, null),
                new TreeNode(2, null, new TreeNode(3)));
        TreeNode right = new TreeNode(6,
                new TreeNode(5),
                new TreeNode(7, null, new TreeNode(8)));
        root.left = left;
        root.right = right;

        TreeNode expected = new TreeNode(30);
        TreeNode leftExpected = new TreeNode(36,
                new TreeNode(36, null, null),
                new TreeNode(35, null, new TreeNode(33)));
        TreeNode rightExpected = new TreeNode(21,
                new TreeNode(26),
                new TreeNode(15, null, new TreeNode(8)));
        expected.left = leftExpected;
        expected.right = rightExpected;

        TreeNode actual = new Solution1038().bstToGst(root);

        assertEquals(expected, actual);
    }
}