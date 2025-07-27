package com.github.baraant.l33tcode.tasks;

/*
14. Longest Common Prefix
Easy
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/
public class Task14 {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        String first = strs[0];
        int minEnd = first.length() - 1;
        int curEnd;

        for (int i = 1; i <= strs.length - 1; i++) {
            curEnd = -1;
            for (int j = 0; j <= Math.min(minEnd, strs[i].length() - 1); j++) {
                if (strs[i].charAt(j) == first.charAt(j)) {
                    curEnd = j;
                } else {
                    break;
                }
            }
            minEnd = Math.min(minEnd, curEnd);
        }

        return minEnd == -1 ? "" : first.substring(0, minEnd + 1);
    }
}
