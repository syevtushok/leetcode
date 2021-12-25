package medium;

/*
https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/submissions/
1769. Minimum Number of Operations to Move All Balls to Each Box

 */
class Solution1769 {
    public int[] minOperations(String boxes) {
        char[] chars = boxes.toCharArray();
        int[] result = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '1' && i != j) {
                    count += Math.abs(i - j);
                }
            }
            result[i] = count;
        }

        return result;
    }
}