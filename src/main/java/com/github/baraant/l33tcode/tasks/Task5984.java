package com.github.baraant.l33tcode.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
5984. Minimum Sum of Four Digit Number After Splitting Digits
Difficulty:Easy
You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.

For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
Return the minimum possible sum of new1 and new2.

Example 1:

Input: num = 2932
Output: 52
Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
Example 2:

Input: num = 4009
Output: 13
Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc.
The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.


Constraints:

1000 <= num <= 9999
*/
public class Task5984 {
    public int minimumSum(int num) {
        int first = num / 1000;
        int second = num / 100 % 10;
        int third = num % 100 / 10;
        int forth = num % 10;

        if (second == 0 && third == 0 && forth == 0) {
            return first;
        }

        if ((second == 0 && third == 0) || (third == 0 && forth == 0) || (second == 0 && forth == 0)) {
            return first + second + third + forth;
        }

        List<Integer> list = Arrays.asList(first, second, third, forth);
        list.sort(Comparator.naturalOrder());

        return list.get(0) * 10 + list.get(1) * 10 + list.get(2) + list.get(3);
    }
}
