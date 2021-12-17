package easy;

/**
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * <p>
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 */
class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}