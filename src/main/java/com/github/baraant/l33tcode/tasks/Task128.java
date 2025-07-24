package com.github.baraant.l33tcode.tasks;

import java.util.HashSet;
import java.util.Set;

/*
128. Longest Consecutive Sequence
Medium
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3

Constraints:

0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
*/
public class Task128 {
    public int longestConsecutive(int[] nums) {

        if (nums.length <= 1) return nums.length;

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int maxSeq = 0;
        int curNum = 0;
        int curSeq = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                curNum = n;
                curSeq = 1;

                while (set.contains(curNum + 1)) {
                    curNum++;
                    curSeq++;
                }

                maxSeq = Math.max(maxSeq, curSeq);
            }
        }

        return maxSeq;
    }
}
