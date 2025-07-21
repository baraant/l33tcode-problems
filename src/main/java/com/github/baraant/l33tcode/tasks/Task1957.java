package com.github.baraant.l33tcode.tasks;

/*
1957. Delete Characters to Make Fancy String
Easy
A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
Example 2:

Input: s = "aaabaaaa"
Output: "aabaa"
Explanation:
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".
Example 3:

Input: s = "aab"
Output: "aab"
Explanation: No three consecutive characters are equal, so return "aab".

Constraints:

1 <= s.length <= 10^5
s consists only of lowercase English letters.
*/
public class Task1957 {
    public String makeFancyString(String s) {
        if (s.isEmpty()) return s;

        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char prevChar = s.charAt(0);
        sb.append(prevChar);

        for (int i = 1; i <= s.length() - 1; i++) {
            char curChar = s.charAt(i);

            if (curChar == prevChar) {
                counter++;
                if (counter > 2) continue;
            } else {
                counter = 1;
                prevChar = s.charAt(i);
            }

            sb.append(curChar);
        }
        return sb.toString();
    }
}
