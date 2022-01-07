package easy;

import java.util.stream.IntStream;

public class Solution1486 {
    public int xorOperation(int n, int start) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum ^= start + 2 * i;
        }

        return sum;
    }

    public int xorOperationStream(int n, int start) {

        return IntStream.range(0, n).map(i -> start + 2 * i).reduce(0, (a, b) -> a ^ b);
    }

}