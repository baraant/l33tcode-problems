package com.github.baraant.l33tcode.data_structures.array;

/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.



Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation:
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
Example 2:

Input: arr = [400]
Output: [-1]
Explanation: There are no elements to the right of index 0.


Constraints:

1 <= arr.length <= 104
1 <= arr[i] <= 105
*/

// my algo: go through the array from the end. Find the biggest value and its index. Update everything on the left to this maximum. Loop once again
public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int lastIndex = arr.length - 1;

        if (lastIndex == 0) {
            arr[0] = -1;
            return arr;
        }

        int leftBorderIndex = 0;

        while (leftBorderIndex < lastIndex) {
            // at least 2 items in the arr left
            int maxValIndex = findIndexOfMaxValueFromTheEnd(arr, leftBorderIndex);
            updateAllValuesToTheMaxValue(arr, maxValIndex, leftBorderIndex);
            leftBorderIndex = maxValIndex;
        }

        arr[lastIndex] = -1;

        return arr;
    }

    private void updateAllValuesToTheMaxValue(int[] arr, int maxValIndex, int leftBorderIndex) {
        for (int i = leftBorderIndex; i < maxValIndex; i++) {
            arr[i] = arr[maxValIndex];
        }
    }

    private int findIndexOfMaxValueFromTheEnd(int[] arr, int leftBorderIndex) {
        int maxValueIndex = arr.length - 1;

        for (int i = arr.length - 2; i > leftBorderIndex; i--) {
            if (arr[i] > arr[maxValueIndex]) {
                maxValueIndex = i;
            }
        }

        return maxValueIndex;
    }
}
