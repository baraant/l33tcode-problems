package com.github.baraant.l33tcode.tasks;

/*
283. Move Zeroes
Easy

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-2^31 <= nums[i] <= 2^31 - 1
*/
public class Task283Unsolved {
    public void moveZeroes(int[] nums) {
        int firstZeroIndex;
        int firstNonZeroIndex;
        int startIndex = 0;

        while (true) {
            firstNonZeroIndex = findFistNonZero(nums, startIndex);
            firstZeroIndex = findFirstZero(nums, startIndex);

            if (firstNonZeroIndex == -1 || firstZeroIndex == -1) {
                return;
            }

            if (firstZeroIndex < firstNonZeroIndex) {
                switchTwoValues(nums, firstZeroIndex, firstNonZeroIndex);
            }

        }

    }

    private void switchTwoValues(int[] nums, int firstIndex, int secondIndex) {
        int buffer = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = buffer;
    }

    private int findFirstZero(int[] nums, int startIndex) {

        for (int i = startIndex; i < nums.length; i++) {
            if (nums[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    private int findFistNonZero(int[] nums, int startIndex) {

        for (int i = startIndex; i < nums.length; i++) {
            if (nums[i] != 0) {
                return i;
            }
        }

        return -1;
    }

    private int shiftAllValuesLeft(int[] nums, int firstIndex, int lastIndex) {
        return -1;
    }

    //----------------------------
    public void moveZeroes2(int[] nums) {
        int zerosAmount = calculateZeros(nums);


    }

    private int calculateZeros(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num == 0) {
                count++;
            }
        }

        return count;
    }
}
