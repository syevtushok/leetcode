package easy;

/*
1688. Count of Matches in Tournament
https://leetcode.com/problems/count-of-matches-in-tournament/
 */
class Solution1688 {
    public int numberOfMatches(int n) {
        int sum = 0;

        while (n > 1) {

            if (n % 2 == 0) {
                n /= 2;
                sum += n;
            } else {
                n /= 2;
                sum += n++;
            }
        }

        return sum;
    }
}