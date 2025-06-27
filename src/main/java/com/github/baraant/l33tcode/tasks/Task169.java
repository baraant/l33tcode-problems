package com.github.baraant.l33tcode.tasks;

/*
169. Majority Element
Easy
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:

n == nums.length
1 <= n <= 5 * 104
-10^9 <= nums[i] <= 10^9

Follow-up: Could you solve the problem in linear time and in O(1) space?
*/
public class Task169 {
    public int majorityElement(int[] nums) {

        int counter = 0;
        int candidate = 0;

        for (int n: nums) {
            if (counter == 0) {
                candidate = n;
            }

            if (candidate == n) {
                counter++;
            } else {
                counter--;
            }
        }

        return candidate;
    }
}
