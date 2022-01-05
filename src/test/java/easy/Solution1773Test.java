package easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1773Test {

    @Test
    void countMatches() {
        List<String> phone = List.of("phone", "blue", "pixel");
        List<String> computer = List.of("computer", "silver", "lenovo");
        List<String> phone2 = List.of("phone", "gold", "iphone");
        int countMatches = new Solution1773().countMatches(List.of(phone, computer, phone2), "color", "silver");

        assertEquals(1, countMatches);

    }
}