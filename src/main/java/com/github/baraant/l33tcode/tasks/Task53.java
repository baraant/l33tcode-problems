package com.github.baraant.l33tcode.tasks;

/*
53. Maximum Subarray
Easy

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23


Constraints:

1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
*/
public class Task53 {
    public int maxSubArray(int[] nums) {

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i<= nums.length -1; i++) {

            curSum += nums[i];

            if (curSum <= 0) {
                curSum = 0;
                maxSum = Math.max(maxSum, nums[i]);
            } else {
                maxSum = Math.max(maxSum, curSum);
            }
        }

        return maxSum;
    }
}
