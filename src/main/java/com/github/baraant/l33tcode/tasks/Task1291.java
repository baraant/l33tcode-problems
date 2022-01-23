package com.github.baraant.l33tcode.tasks;


import java.util.ArrayList;
import java.util.List;

/*
1291. Sequential Digits
Medium

An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

Example 1:

Input: low = 100, high = 300
Output: [123,234]
Example 2:

Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]


Constraints:

10 <= low <= high <= 10^9
*/
public class Task1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        int leftLength = String.valueOf(low).length();
        int rightLength = Math.min(9, String.valueOf(high).length() + 1);
        String string = "123456789";

        List<Integer> result = new ArrayList<>();

        for (int i = leftLength; i <= rightLength; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                String currentString = string.substring(j, i + j);
                int currentInt = Integer.parseInt(currentString);

                if (low <= currentInt && currentInt <= high) {
                    result.add(currentInt);
                }
            }
        }
        return result;
    }
}