package com.github.baraant.l33tcode.tasks;

import java.util.HashMap;
import java.util.Map;

/*
1. Two Sum
Easy

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
public class Task1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> indexToValue = new HashMap<>();
        int cur;

        for (int i = 0; i < nums.length; i++) {
            cur = nums[i];
            if (indexToValue.getOrDefault(target - cur, 0) != 0) {
                result[0] = i;
                result[1] = indexToValue.get(target - cur) - 1;
                return result;
            } else {
                indexToValue.put(cur, i + 1);
            }
        }

        return result;
    }
}
