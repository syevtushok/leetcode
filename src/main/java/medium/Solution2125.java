package medium;

/*
2125. Number of Laser Beams in a Bank
https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
 */
class Solution2125 {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int prev = 0;
        for (String s : bank) {
            int devices = countDevices(s);
            if (devices != 0) {
                count += prev * devices;
                prev = devices;
            }
        }

        return count;
    }

    private int countDevices(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        return count;
    }
}