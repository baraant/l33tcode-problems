package com.github.baraant.l33tcode.tasks;


import java.util.HashSet;
import java.util.Set;

/*
202. Happy Number
Easy
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false


Constraints:

1 <= n <= 2^31 - 1
*/
public class Task202 {
    public boolean isHappy(int n) {

        if (n == 1) {
            return true;
        }

        Set<Integer> seen = new HashSet<>();

        while (seen.add(n)) {
            n = sumOfSquares(n);
            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    private int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n = n / 10;
        }

        return sum;
    }
}