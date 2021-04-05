package com.github.kollaps92.l33tcode.tasks;

/*
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.



Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

public class Task1748 {

    public int sumOfUnique(int[] nums) {
        int result = 0;
        int[] myValueHolder = new int[101];

        for (int i = 0; i <= nums.length - 1; i++) {
            if (myValueHolder[nums[i]] == 0) {
                result += nums[i];
                myValueHolder[nums[i]] = 1;
            } else if (myValueHolder[nums[i]] == 1) {
                result -= nums[i];
                myValueHolder[nums[i]] = 2;
            }

        }

        return result;
    }
}
