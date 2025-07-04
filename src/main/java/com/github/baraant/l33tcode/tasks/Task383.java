package com.github.baraant.l33tcode.tasks;


import java.util.HashMap;
import java.util.Map;

/*
383. Ransom Note
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:

1 <= ransomNote.length, magazine.length <= 10^5
ransomNote and magazine consist of lowercase English letters.
*/
public class Task383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> myMap = new HashMap<>();

        for (char c: magazine.toCharArray()) {
            myMap.put(c, myMap.getOrDefault(c, 0) +1);
        }

        for (char c: ransomNote.toCharArray()) {
            if (myMap.getOrDefault(c, 0) == 0) {
                return false;
            } else {
                myMap.put(c, myMap.get(c) -1);
            }
        }

        return true;
    }
}
