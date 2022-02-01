package easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution94Test {

    @Test
    void inorderTraversal() {
        TreeNode node = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> integers = new Solution94().inorderTraversal(node);
        assertEquals(List.of(1, 3, 2), integers);
    }
}