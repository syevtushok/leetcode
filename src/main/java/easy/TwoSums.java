package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>
 *
 * <p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>
 *
 * <p>You can return the answer in any order.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [2,7,11,15], target = 9
 * <strong>Output:</strong> [0,1]
 * <strong>Output:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [3,2,4], target = 6
 * <strong>Output:</strong> [1,2]
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [3,3], target = 6
 * <strong>Output:</strong> [0,1]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 * <li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
 * <li><strong>Only one valid answer exists.</strong></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than&nbsp;<code>O(n<sup>2</sup>)&nbsp;</code>time complexity?<div><div>Related Topics</div><div><li>Array</li><li>Hash Table</li></div></div><br><div><li>👍 26739</li><li>👎 861</li></div>
 */

public class TwoSums {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSums().twoSumFirstApproach(new int[]{ 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(new TwoSums().twoSumSecondApproach(new int[]{ 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(new TwoSums().twoSumSecondApproach(new int[]{ 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(new TwoSums().twoSumThirdApproach(new int[]{ 3, 2, 4 }, 6)));
    }

    public int[] twoSumFirstApproach(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{ i, j };
                }
            }
        }
        return new int[]{ -1 };
    }

    public int[] twoSumSecondApproach(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{ i, map.get(complement) };
            }
        }

        return new int[]{ -1 };
    }

    public int[] twoSumThirdApproach(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{ map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[]{ -1 };
    }


}

