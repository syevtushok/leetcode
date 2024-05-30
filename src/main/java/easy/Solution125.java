package easy;

public class Solution125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int l = 0, r = s.length() - 1; l <= r; ) {
            if (!Character.isLetterOrDigit(s.codePointAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.codePointAt(r))) {
                r--;
                continue;
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
