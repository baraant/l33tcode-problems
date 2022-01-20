package com.github.baraant.l33tcode.tasks;

import java.util.Arrays;

/*
557. Reverse Words in a String III
Easy

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"


Constraints:

1 <= s.length <= 5 * 10^4
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
*/
public class Task557 {
    public String reverseWords(String s) {
        int left = 0;
        int right;
        char[] chars = s.toCharArray();

        while (left < s.length()) {
            int i = left;

            while (i < s.length() && chars[i] != ' ') {
                i++;
            }

            right = i - 1;

            reverseString(chars, left, right);

            left = i + 1;
        }

        return String.valueOf(chars);
    }

    private void reverseString(char[] s, int leftIndex, int rightIndex) {
        char buffer;

        for (int i = leftIndex; i <= leftIndex + (rightIndex - leftIndex) / 2; i++) {
            buffer = s[i];
            s[i] = s[leftIndex + rightIndex - i];
            s[leftIndex + rightIndex - i] = buffer;
        }
    }
}
