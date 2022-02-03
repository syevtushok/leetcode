package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution701Test {

    @Test
    void insertIntoBST() {
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode expected = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(5), null));
        TreeNode actual = new Solution701().insertIntoBST(treeNode, 5);

        assertEquals(expected, actual);
    }
}