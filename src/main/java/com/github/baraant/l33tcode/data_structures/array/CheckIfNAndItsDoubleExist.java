package com.github.baraant.l33tcode.data_structures.array;

/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]


Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
Example 2:

Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
Example 3:

Input: arr = [3,1,7,11]
Output: false
Explanation: In this case does not exist N and M, such that N = 2 * M.


Constraints:

2 <= arr.length <= 500
-10^3 <= arr[i] <= 10^3
*/

public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        bubbleSortByAbs(arr);

        for (int i = 0; i <= arr.length - 2; i++) {

            if (checkIfExistDoubleValueOfThisIndex(arr, i)) {
                return true;
            }
        }

        return false;
    }

    private boolean checkIfExistDoubleValueOfThisIndex(int[] arr, int index) {
        for (int i = index + 1; i <= arr.length - 1; i++) {
            if (arr[i] == 2 * arr[index]) {
                return true;
            }
        }
        return false;
    }

    private void bubbleSortByAbs(int[] arr) {
        int buffer;

        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (Math.abs(arr[j]) > Math.abs(arr[j + 1])) {
                    buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
    }

}
