package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1302Test {

    @Test
    void deepestLeavesSum() {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        treeNode.left = new TreeNode(2,
                new TreeNode(4, new TreeNode(7, null, null), null),
                new TreeNode(5, null, null));
        treeNode.right = new TreeNode(3, null, new TreeNode(6, null,
                new TreeNode(8, null, null)));
        int sum = new Solution1302().deepestLeavesSum(treeNode);

        assertEquals(15, sum);
    }
}