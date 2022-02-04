package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution700Test {

    @Test
    void searchBST() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode expected = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode actual = new Solution700().searchBST(root, 2);

        assertEquals(expected, actual);
    }
}