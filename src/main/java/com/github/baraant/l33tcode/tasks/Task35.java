package com.github.baraant.l33tcode.tasks;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:

1 <= nums.length <= 10^4
-10^4 <= nums[i] <= 10^4
nums contains distinct values sorted in ascending order.
-10^4 <= target <= 10^4
*/

public class Task35 {
    public int searchInsert(int[] nums, int target) {
        return myBinarySearch(nums, target, 0, nums.length - 1);
    }

    private int myBinarySearch(int[] nums, int target, int left, int right) {
        if (left >= right) {
            if (nums[left] > target) {
                return left;
            } else if (nums[left] < target) {
                return left + 1;
            } else {
                return left;
            }
        }

        int cur = left + (right - left) / 2;

        if (nums[cur] > target) {
            return myBinarySearch(nums, target, left, cur);
        } else if (nums[cur] < target) {
            return myBinarySearch(nums, target, cur + 1, right);
        } else {
            return cur;
        }
    }
}
