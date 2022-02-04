package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution104Test {

    @Test
    void maxDepth() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int actual = new Solution104().maxDepth(root);
        assertEquals(3, actual);
    }
}