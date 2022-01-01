package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
1282. Group the People Given the Group Size They Belong To
https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
 */
public class Solution1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> groups = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            List<Integer> group = map.getOrDefault(groupSize, new ArrayList<>());

            group.add(i);
            if (group.size() == groupSize) {
                groups.add(group);
                map.remove(groupSize);
            } else {
                map.put(groupSize, group);
            }
        }

        return groups;
    }
}