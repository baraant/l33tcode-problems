package com.github.baraant.l33tcode.tasks;

/*
69. Sqrt(x)
Easy

Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

Constraints:

0 <= x <= 2^31 - 1
*/
public class Task69 {
    public int mySqrt(int x) {
        int maxSqrt = 46340;

        return myBinarySearch(x, 0, Math.min(x, maxSqrt));
    }

    private int myBinarySearch(int x, int left, int right) {

        if (left == right) {
            return left;
        }

        int mid = left + (right - left) / 2;

        int sqrMid = mid * mid;

        if ((sqrMid <= x) && (x - sqrMid < 2 * mid + 1)) {
            return mid;
        }

        if (x < sqrMid) {
            return myBinarySearch(x, 0, mid - 1);
        } else {
            return myBinarySearch(x, mid + 1, right);
        }
    }

}
