package com.github.baraant.l33tcode.tasks;

import java.util.HashSet;
import java.util.Set;

/*
219. Contains Duplicate II
Easy
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

Constraints:

1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
0 <= k <= 10^5
*/
public class Task219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int arrLen = nums.length;

        int cur = 0;
        int left = 0;
        int right = Math.min(k, arrLen - 1);
        Set<Integer> set = new HashSet<>();

        while (right <= arrLen - 1) {
            if (!set.add(nums[cur])) {
                return true;
            } else {
                if (cur == right) {
                    set.remove(nums[left]);
                    left++;
                    right++;
                }
                cur++;
            }
        }

        return false;
    }
}
