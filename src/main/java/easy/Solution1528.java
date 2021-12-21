package easy;
/*
1528. Shuffle String
https://leetcode.com/problems/shuffle-string/
 */
class Solution1528 {
    public String restoreString(String s, int[] indices) {
        char[] a = new char[indices.length];

        for (int i = 0; i < s.length(); i++) {
            a[indices[i]] = s.charAt(i);
        }

        return String.valueOf(a);

    }
}