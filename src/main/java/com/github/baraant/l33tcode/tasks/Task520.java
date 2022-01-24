package com.github.baraant.l33tcode.tasks;

/*
520. Detect Capital
Easy

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false


Constraints:

1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
*/
public class Task520 {
    public boolean detectCapitalUse(String word) {
        boolean allCapitals;
        boolean onlyFirstCapital;
        boolean allNotCapitals;

        char[] charArr = word.toCharArray();

        if (word.length() == 1) {
            return true;
        }

        if (Character.isUpperCase(charArr[0]) && Character.isUpperCase(charArr[1])) {
            allCapitals = true;
            onlyFirstCapital = false;
            allNotCapitals = false;
        } else if (Character.isUpperCase(charArr[0]) && !Character.isUpperCase(charArr[1])) {
            allCapitals = false;
            onlyFirstCapital = true;
            allNotCapitals = false;
        } else {
            allCapitals = false;
            onlyFirstCapital = false;
            allNotCapitals = true;
        }

        for (int i = 1; i < word.length(); i++) {
            if (allCapitals && !Character.isUpperCase(charArr[i])) {
                return false;
            }

            if (onlyFirstCapital && Character.isUpperCase(charArr[i])) {
                return false;
            }

            if (allNotCapitals && Character.isUpperCase(charArr[i])) {
                return false;
            }
        }

        return true;
    }
}
