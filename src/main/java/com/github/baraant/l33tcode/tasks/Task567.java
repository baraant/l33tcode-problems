package com.github.baraant.l33tcode.tasks;

/*
567. Permutation in String
Medium

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false


Constraints:

1 <= s1.length, s2.length <= 10^4
s1 and s2 consist of lowercase English letters.
*/
public class Task567 {
    public boolean checkInclusion(String s1, String s2) {
        int[] charToAmount = new int[26];
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return false;
        }

        for (int i = 0; i < len1; i++) {
            charToAmount[s2.charAt(i) - 'a']++;
            charToAmount[s1.charAt(i) - 'a']--;
        }
        if (allZeroesPresented(charToAmount)) {
            return true;
        }

        for (int i = len1; i < len2; i++) {
            charToAmount[s2.charAt(i) - 'a']++;
            charToAmount[s2.charAt(i - len1) - 'a']--;

            if (allZeroesPresented(charToAmount)) {
                return true;
            }
        }

        return false;
    }

    private boolean allZeroesPresented(int[] charToAmount) {
        for (int j : charToAmount) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
}
