package com.github.baraant.l33tcode.tasks;

import java.util.HashMap;
import java.util.Map;

/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 10^4
s consists of English letters, digits, symbols and spaces.
*/
public class Task3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int max = 0;
        Map<Character, Integer> charToPos = new HashMap<>();

        while (j < s.length()) {
            Character curChar = s.charAt(j);

            if (charToPos.containsKey(curChar)) {
                i = Math.max(i, charToPos.get(curChar) + 1);
            }

            charToPos.put(curChar, j);
            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }
}
