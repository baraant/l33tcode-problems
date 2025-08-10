package com.github.baraant.l33tcode.tasks;

import java.util.Arrays;
import java.util.Set;

/*
869. Reordered Power of 2
Medium
You are given an integer n. We reorder the digits in any order (including the original order) such that the leading digit is not zero.

Return true if and only if we can do this so that the resulting number is a power of two.

Example 1:

Input: n = 1
Output: true
Example 2:

Input: n = 10
Output: false

Constraints:

1 <= n <= 10^9
*/
public class Task869 {

    private static final Set<String> seen = Set.of("1", "2", "4", "8", "16", "23", "46", "128", "256", "125", "0124",
            "0248", "0469", "1289", "13468", "23678", "35566", "011237", "122446", "224588", "0145678", "0122579",
            "0134449", "0368888", "11266777", "23334455", "01466788", "112234778", "234455668", "012356789");

    public boolean reorderedPowerOf2(int n) {

        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        String val = new String(chars);

        return seen.contains(val);
    }
}
