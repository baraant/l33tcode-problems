package com.github.kollaps92.l33tcode.data_structure_array;

/*
    Given a binary array, find the maximum number of consecutive 1s in this array.

    Example 1:
    Input: [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s.
        The maximum number of consecutive 1s is 3.
    Note:

    The input array will only contain 0 and 1.
    The length of input array is a positive integer and will not exceed 10,000
*/
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int buffer = 0;

        for (int num: nums) {
            if (num == 1) {
                buffer++;
            } else {
                result = Math.max(result, buffer);
                buffer = 0;
            }
        }

        result = Math.max(result, buffer);

        return result;
    }

}
