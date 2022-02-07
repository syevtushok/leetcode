package easy;

/*
9. Palindrome Number
https://leetcode.com/problems/palindrome-number/
 */
class Solution9 {
    public boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}