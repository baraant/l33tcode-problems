package com.github.baraant.l33tcode.tasks;

import java.util.ArrayList;
import java.util.List;

/*
9. Palindrome Number
Easy
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:

-2^31 <= x <= 2^31 - 1

Follow up: Could you solve it without converting the integer to a string?
*/
public class Task9 {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        List<Character> chars = new ArrayList<>();
        while (x > 0) {
            int lastChar = x % 10;
            chars.add((char) lastChar);
            x = x / 10;
        }

        int len = chars.size();

        for (int i = 0; i<= len / 2 - 1; i++) {
            if (chars.get(i) != chars.get(len - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
