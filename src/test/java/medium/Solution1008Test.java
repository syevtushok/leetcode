package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1008Test {

    @Test
    void bstFromPreorder() {
        TreeNode actual = new Solution1008().bstFromPreorder(new int[]{ 8, 5, 1, 7, 10, 12 });
        TreeNode expected = new TreeNode(8);
        TreeNode left = new TreeNode(5, new TreeNode(1), new TreeNode(7));
        TreeNode right = new TreeNode(10, null, new TreeNode(12));
        expected.left = left;
        expected.right = right;

        assertEquals(expected, actual);
    }
}