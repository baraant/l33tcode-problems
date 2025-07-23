package com.github.baraant.l33tcode.tasks;

import java.util.ArrayDeque;
import java.util.Deque;

/*
1717. Maximum Score From Removing Substrings
Medium
You are given a string s and two integers x and y. You can perform two types of operations any number of times.

Remove substring "ab" and gain x points.
For example, when removing "ab" from "cabxbae" it becomes "cxbae".
Remove substring "ba" and gain y points.
For example, when removing "ba" from "cabxbae" it becomes "cabxe".
Return the maximum points you can gain after applying the above operations on s.

Example 1:

Input: s = "cdbcbbaaabab", x = 4, y = 5
Output: 19
Explanation:
- Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
- Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
- Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
- Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
Total score = 5 + 4 + 5 + 5 = 19.
Example 2:

Input: s = "aabbaaxybbaabb", x = 5, y = 4
Output: 20

Constraints:

1 <= s.length <= 10^5
1 <= x, y <= 10^4
s consists of lowercase English letters.
*/
public class Task1717 {

    private String result;

    public int maximumGain(String s, int x, int y) {
        if (s.length() == 1) {
            return 0;
        }

        if (x > y) {
            return removePattern(s, 'a', 'b', x) + removePattern(result, 'b', 'a', y);
        } else {
            return removePattern(s, 'b', 'a', y) + removePattern(result, 'a', 'b', x);
        }
    }

    private int removePattern(String str, char first, char second, int points) {
        Deque<Character> stack = new ArrayDeque<>();
        int score = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            char curChar = str.charAt(i);

            if (!stack.isEmpty() && stack.peek() == first && curChar == second) {
                score += points;
                stack.pop();
            } else {
                stack.push(curChar);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        result = sb.reverse().toString();

        return score;
    }
}
