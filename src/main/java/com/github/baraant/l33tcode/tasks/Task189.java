package com.github.baraant.l33tcode.tasks;


/*
189. Rotate Array
Medium

Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


Constraints:

1 <= nums.length <= 10^5
-2^31 <= nums[i] <= 2^31 - 1
0 <= k <= 10^5

*/
public class Task189 {
    public void rotate(int[] nums, int k) {

        int length = nums.length;
        k = k % length;

        if (k == 0) {
            return;
        }

        int gcd = gcdByEuclidsAlgorithm(k, length);

        if (gcd == 1) {
            rotateExactTimes(nums, 0, k, length);
        } else {
            for (int i = 0; i < gcd; i++) {
                rotateExactTimes(nums, i, k, length / gcd);
            }
        }

    }

    private void rotateExactTimes(int[] array, int initialIndex, int rotationShift, int times) {

        int length = array.length;
        int i = initialIndex;
        int j;
        int buffer;
        int rotatedValue = array[initialIndex];

        while (times > 0) {
            j = (i + rotationShift) % length;

            buffer = array[j];
            array[j] = rotatedValue;
            rotatedValue = buffer;

            i = j;
            times--;
        }
    }

    private int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

}
