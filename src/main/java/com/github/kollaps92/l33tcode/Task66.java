package com.github.kollaps92.l33tcode;

/*
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
*/

public class Task66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        boolean cornerCase = true;
        boolean needToAddOne = true;

        for (int i = 0; i <= length - 1; i++) {
            if (digits[i] != 9) {
                cornerCase = false;
                break;
            }
        }

        if (cornerCase) {
            int[] result = new int[length + 1];
            result[0] = 1;
            for (int j = 1; j <= length - 1; j++) {
                result[j] = 0;
            }
            return result;
        }

        for (int k = length - 1; k >= 0; k--) {
            if (!needToAddOne) continue;

            needToAddOne = false;
            if (digits[k] != 9) {
                digits[k]++;
            } else {
                if (digits[k] == 9) {
                    digits[k] = 0;
                    needToAddOne = true;
                }
            }
        }

        return digits;
    }
}
