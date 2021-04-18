package com.github.kollaps92.l33tcode.data_structures.array;

/*
    Duplicate Zeros

    Solution
    Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

    Note that elements beyond the length of the original array are not written.

    Do the above modifications to the input array in place, do not return anything from your function.



    Example 1:

    Input: [1,0,2,3,0,4,5,0]
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    Example 2:

    Input: [1,2,3]
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,2,3]


    Note:

    1 <= arr.length <= 10000
    0 <= arr[i] <= 9
*/

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int i = 0;

        while (i < arr.length - 1) {
            if (arr[i] == 0) {
                takeAPostfixAndMoveOneStepToTheRight(arr, i);
                i++;
            }
            i++;
        }
    }

    private void takeAPostfixAndMoveOneStepToTheRight(int[] arr, int fromIndex) {
        for (int i = arr.length - 1; i > fromIndex; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public void duplicateZeros_failedCauseIDontReallyUnderstandInPlaceOpearations(int[] arr) {
        int length = arr.length;
        int currentIndex = 0;

        int[] resultedArr = new int[length];

        for (int i = 0; i < length; i++) {
            if (currentIndex >= length) {
                continue;
            }

            if (arr[i] != 0) {
                resultedArr[currentIndex] = arr[i];
                currentIndex++;
            } else {
                resultedArr[currentIndex] = 0;

                if (currentIndex < length) {
                    resultedArr[currentIndex + 1] = 0;
                }
                currentIndex += 2;
            }
        }

        arr = new int[length];
        arr = resultedArr;
        System.out.println("biba");
    }
}
