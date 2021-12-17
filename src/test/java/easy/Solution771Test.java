package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution771Test {

    @Test
    void numJewelsInStones() {
        int actualFirst = new Solution771().numJewelsInStones("aA", "aAAbbbb");
        int actualSecond = new Solution771().numJewelsInStones("z", "ZZ");

        assertEquals(3, actualFirst);
        assertEquals(0, actualSecond);
    }
}