package com.github.baraant.l33tcode.tasks;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/
public class Task242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.compute(c, (key, value) -> (value == null) ? 1 : value + 1);
        }

        for (char c2 : t.toCharArray()) {
            map.compute(c2, (key, value) -> (value == null) ? -1 : value - 1);
        }

        return map.values().stream()
                .allMatch(value -> value == 0);
    }
}
