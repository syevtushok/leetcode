package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution9Test {

    @Test
    void isPalindrome() {
        boolean actual = new Solution9().isPalindrome(121);
        assertTrue(actual);
    }
}