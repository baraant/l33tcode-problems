package com.github.baraant.l33tcode.data_structures.array;

/*
Merge Sorted Array

Solution
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.



Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]


Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[i] <= 109
*/

/*
 * My Algorithm: run step-by-step through each array and shift values if current value of num2 < num1;
 * Otherwise - do nothing
 * */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int nums2CurrentIndex = 0;
        int itemsLeftInM = m;
        int i = 0;

        while (i < nums1.length) {
            if (nums2CurrentIndex == nums2.length) {
                return;
            }

            if (itemsLeftInM == 0) {
                nums1[i] = nums2[nums2CurrentIndex];
                nums2CurrentIndex++;
                i++;
                continue;
            }

            if (nums1[i] > nums2[nums2CurrentIndex]) {
                makeAShiftToTheRightIncludingIndex(nums1, i, n - nums2CurrentIndex);
                nums1[i] = nums2[nums2CurrentIndex];
                nums2CurrentIndex++;
            } else {
                itemsLeftInM--;
            }

            i++;
        }
    }

    private void makeAShiftToTheRightIncludingIndex(int[] arr, int index, int shift) {
        int i = arr.length - shift;

        while (index < i) {
            arr[i] = arr[i - 1];
            i--;
        }
    }
}
