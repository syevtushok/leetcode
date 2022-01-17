package easy;

import java.util.Arrays;

/*
2037. Minimum Number of Moves to Seat Everyone
https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
 */
public class Solution2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int count = 0;

        for (int i = 0; i < seats.length; i++) {
            count += Math.abs(students[i] - seats[i]);
        }

        return Math.abs(count);
    }
}