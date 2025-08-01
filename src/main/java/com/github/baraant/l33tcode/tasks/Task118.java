package com.github.baraant.l33tcode.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
118. Pascal's Triangle
Easy

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]


Constraints:

1 <= numRows <= 30
*/
public class Task118 {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> firstRow = Arrays.asList(1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(firstRow);

        List<Integer> curRow = firstRow;

        for (int i = 1; i< numRows; i++) {
            List<Integer> nextRow = generateNextRow(curRow);
            result.add(nextRow);
            curRow = nextRow;
        }
        return result;
    }

    private List<Integer> generateNextRow(List<Integer> prevRow) {
        List<Integer> result = new ArrayList<>();

        Iterator<Integer> iterator = prevRow.iterator();

        int prevValue = 0;
        int curValue;

        do {
            curValue = iterator.next();
            result.add(prevValue + curValue);
            prevValue = curValue;
        } while (iterator.hasNext());

        result.add(prevValue);

        return result;
    }
}
