package com.github.baraant.l33tcode.data_structures.math;


/*
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.

Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).

Constraints:

-2^31 <= n <= 2^31 - 1
*/
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        //biggest power of three that fits 2^31 is 3^19. If 3^19 mod n == 0 then we are ok
        return n > 0 && 1162261467 % n == 0;
    }
}
