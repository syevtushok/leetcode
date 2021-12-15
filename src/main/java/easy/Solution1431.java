package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }

    public List<Boolean> kidsWithCandiesSecondApproach(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().orElse(0);
        return Arrays.stream(candies).mapToObj(value -> value + extraCandies >= max).collect(Collectors.toList());
    }
}