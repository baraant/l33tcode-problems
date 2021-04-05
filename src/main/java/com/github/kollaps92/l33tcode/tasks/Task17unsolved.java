package com.github.kollaps92.l33tcode.tasks;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.





Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]


Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
*/

import java.util.ArrayList;
import java.util.List;

public class Task17unsolved {
    // READ ABOUT BINARY TREES
    public List<String> letterCombinations(String digits) {

        char[] two = {'a', 'b', 'c'};
        char[] three = {'d', 'e', 'f'};
        char[] four = {'g', 'h', 'i'};
        char[] five = {'j', 'k', 'l'};
        char[] six = {'m', 'n', 'o'};
        char[] seven = {'p', 'q', 'r', 's'};
        char[] eight = {'t', 'u', 'v'};
        char[] nine = {'w', 'x', 'y', 'z'};

        return new ArrayList<>();
    }
}
