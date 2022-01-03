package easy;

/*
1221. Split a String in Balanced Strings
https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class Solution1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        char[] c = s.toCharArray();

        int r = 0;
        int l = 0;

        for (char value : c) {
            if (value == 'L') {
                l++;
            } else {
                r++;
            }

            if (r == l) {
                count++;
            }
        }

        return count;

    }
}