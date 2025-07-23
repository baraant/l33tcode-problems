package com.github.baraant.l33tcode.tasks;

/*
392. Is Subsequence
Easy
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

Constraints:

0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
*/
public class Task392 {
    public boolean isSubsequence(String s, String t) {

        if (s.length() > t.length()) {
            return false;
        }

        int prev = -1;

        for (int i = 0; i <= s.length() - 1; i++) {
            int cur = t.indexOf(s.charAt(i), prev + 1);
            if (prev > cur || cur == -1) {
                return false;
            } else {
                prev = cur;
            }
        }

        return true;
    }
}
