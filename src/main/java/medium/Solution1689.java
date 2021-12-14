package medium;

/**
 * A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
 * <p>
 * Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = "32"
 * Output: 3
 * Explanation: 10 + 11 + 11 = 32
 * Example 2:
 * <p>
 * Input: n = "82734"
 * Output: 8
 * Example 3:
 * <p>
 * Input: n = "27346209830709182346"
 * Output: 9
 */
class Solution1689 {
    public static void main(String[] args) {
        System.out.println(new Solution1689().minPartitions("32"));
        System.out.println(new Solution1689().minPartitions("27346209830709182346"));
    }


    public int minPartitions(String n) {
        int max = 0;
        char[] chars = n.toCharArray();
        for (char aChar : chars) {
            max = Math.max(max, aChar - '0');
        }
        return max;
    }
}