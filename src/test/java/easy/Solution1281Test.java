package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1281Test {

    @Test
    public void subtract() {
        int actual = new Solution1281().subtractProductAndSum(234);

        assertEquals(15, actual);
    }
}