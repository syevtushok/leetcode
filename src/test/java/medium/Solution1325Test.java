package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1325Test {

    @Test
    void removeLeafNodes() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(2), null), new TreeNode(3, new TreeNode(2), new TreeNode(4)));
        TreeNode expected = new TreeNode(1, null, new TreeNode(3, null, new TreeNode(4)));

        TreeNode actual = new Solution1325().removeLeafNodes(root, 2);

        assertEquals(expected, actual);
    }
}