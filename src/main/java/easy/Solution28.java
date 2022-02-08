package easy;

/*
28. Implement strStr()
https://leetcode.com/problems/implement-strstr/
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }

        return -1;
    }
}