package com.github.baraant.l33tcode.data_structures.array;

/*
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



    Example 1:

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].
    Example 2:

    Input: nums = [-7,-3,2,3,11]
    Output: [4,9,9,49,121]


    Constraints:

    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums is sorted in non-decreasing order.


    Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
*/

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int length = nums.length;

        if (nums[0] >= 0) {
            return calculateResultForOnlyPositiveValues(nums);
        }

        if (nums[length - 1] <= 0) {
            return calculateResultForOnlyNegativeValues(nums);
        }

        return calculateResultWhenBothValuesArePresented(nums,
                findIndexOfLastNegativeValue(nums, 0, length - 1));
    }

    private int[] calculateResultForOnlyPositiveValues(int[] nums) {
        for (int i = 0; i< nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }

    private int[] calculateResultForOnlyNegativeValues(int[] nums) {
        int buffer;
        int length = nums.length;

        for (int i = 0; i< length / 2; i++) {
            buffer = nums[i];
            nums[i] = nums[length - 1 - i] * nums[length - 1 - i];
            nums[length - 1 - i] = buffer * buffer;
        }

        if (length % 2 == 1) {
            nums[length / 2] = nums[length / 2] * nums[length / 2];
        }

        return nums;
    }

    private int[] calculateResultWhenBothValuesArePresented(int[] nums, int lastNegativeValueIndex) {
        int[] result = new int[nums.length];
        int leftIndex = lastNegativeValueIndex;
        int rightndex = lastNegativeValueIndex + 1;

        for (int i = 0; i < nums.length; i++) {
            if (leftIndex == -1) {
                result[i] = nums[rightndex] * nums[rightndex];
                rightndex++;
                continue;
            }

            if (rightndex == nums.length) {
                result[i] = nums[leftIndex] * nums[leftIndex];
                leftIndex--;
                continue;
            }

            if (Math.abs(nums[leftIndex]) <= Math.abs(nums[rightndex])) {
                result[i] = nums[leftIndex] * nums[leftIndex];
                leftIndex--;
            } else {
                result[i] = nums[rightndex] * nums[rightndex];
                rightndex++;
            }
        }

        return result;
    }

    protected int findIndexOfLastNegativeValue(int[] nums, int firstIndex, int lastIndex) {
        if (firstIndex == lastIndex) return firstIndex;

        if (lastIndex - firstIndex == 1) {
            return nums[lastIndex] < 0 ? lastIndex : firstIndex;
        }

        int halfIndex = firstIndex + (lastIndex - firstIndex) / 2;

        if (nums[halfIndex] < 0) {
            return findIndexOfLastNegativeValue(nums, halfIndex, lastIndex);
        } else if (nums[halfIndex] > 0) {
            return findIndexOfLastNegativeValue(nums, firstIndex, halfIndex);
        } else {
            return halfIndex - 1;
        }
    }
}
