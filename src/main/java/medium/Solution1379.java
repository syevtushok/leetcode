package medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */
public class Solution1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> stack = new LinkedList<>();
        stack.add(cloned);

        while (!stack.isEmpty()) {
            TreeNode poll = stack.poll();
            if (poll != null) {
                if (poll.val == target.val) {
                    return poll;
                }
                stack.add(poll.right);
                stack.add(poll.left);
            }
        }
        return target;
    }
}