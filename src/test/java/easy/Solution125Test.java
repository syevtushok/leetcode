package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution125Test {

    Solution125 solution = new Solution125();

    @Test
    void isPalindrome_withPalindromeString_returnsTrue() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome_withNonPalindromeString_returnsFalse() {
        assertFalse(solution.isPalindrome("Not a palindrome"));
    }

    @Test
    void isPalindrome_withEmptyString_returnsTrue() {
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    void isPalindrome_withSingleCharacter_returnsTrue() {
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    void isPalindrome_withPalindromeStringMixedCase_returnsTrue() {
        assertTrue(solution.isPalindrome("Able was I ere I saw Elba"));
    }

    @Test
    void isPalindrome_withPalindromeStringSpecialCharacters_returnsTrue() {
        assertTrue(solution.isPalindrome("Madam, in Eden, I'm Adam"));
    }
}