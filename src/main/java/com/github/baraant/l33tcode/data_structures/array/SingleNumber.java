package com.github.baraant.l33tcode.data_structures.array;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1


Constraints:

1 <= nums.length <= 3 * 10^4
-3 * 10^4 <= nums[i] <= 3 * 10^4
Each element in the array appears twice except for one element which appears only once.
------------
Notes: XOR operation is additive operation. So if we xor all values one-by-one, it is the same if we group the same numbers and firstly xor them (having 0 as a result).
And the remaining value - is our expected result
*/
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }
}
