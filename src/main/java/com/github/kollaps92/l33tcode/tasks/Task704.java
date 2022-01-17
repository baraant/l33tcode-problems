package com.github.kollaps92.l33tcode.tasks;

/*

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1


Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.

*/

public class Task704 {
    public int search(int[] nums, int target) {
        return myBinarySearch(nums, target, 0, nums.length - 1);
    }

    private int myBinarySearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        if (left == right) {
            return nums[left] == target ? left : -1;
        }

        int cur = left + (right - left) / 2;

        if (nums[cur] > target) {
            return myBinarySearch(nums, target, left, cur - 1);
        } else if (nums[cur] < target) {
            return myBinarySearch(nums, target, cur + 1, right);
        } else {
            return cur;
        }
    }
}
