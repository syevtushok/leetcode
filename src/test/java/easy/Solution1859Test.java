package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1859Test {

    @Test
    void sortSentence() {
        String actual = new Solution1859().sortSentence("is2 sentence4 This1 a3");
        assertEquals("This is a sentence", actual);
    }
}