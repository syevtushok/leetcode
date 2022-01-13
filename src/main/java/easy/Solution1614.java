package easy;

/*
1614. Maximum Nesting Depth of the Parentheses
https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
class Solution1614 {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp == '(') {
                count++;
            } else if (temp == ')') {
                count--;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}