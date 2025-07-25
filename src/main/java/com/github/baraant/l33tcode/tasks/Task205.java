package com.github.baraant.l33tcode.tasks;

import java.util.HashMap;
import java.util.Map;

/*
205. Isomorphic Strings
Easy
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true

Constraints:

1 <= s.length <= 5 * 10^4
t.length == s.length
s and t consist of any valid ascii character.
*/
public class Task205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i <= s.length() - 1; i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(tCh)) {
                    return false;
                }
                map.put(sCh, tCh);
            } else {
                if (map.get(sCh) != tCh) {
                    return false;
                }
            }
        }
        return true;
    }
}
