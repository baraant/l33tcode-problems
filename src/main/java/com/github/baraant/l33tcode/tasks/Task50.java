package com.github.baraant.l33tcode.tasks;


/*
50. Pow(x, n)
Medium
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

Constraints:

-100.0 < x < 100.0
-2^31 <= n <= 2^31-1
n is an integer.
Either x is not zero or n > 0.
-10^4 <= xn <= 10^4
*/
public class Task50 {
    public double myPow(double x, int n) {
        if (x == 0.0) return 0.0;
        if (n == 0) return 1.0;

        if (n < 0) {
            return 1 / myFastPow(x, -n);
        } else {
            return myFastPow(x, n);
        }
    }

    private double myFastPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double half = myFastPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
