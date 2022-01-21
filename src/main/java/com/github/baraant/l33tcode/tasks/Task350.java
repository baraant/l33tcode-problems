package com.github.baraant.l33tcode.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
350. Intersection of Two Arrays II
Easy

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/
public class Task350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numberToAmount = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int buffer;

        for (int num1 : nums1) {
            if (numberToAmount.containsKey(num1)) {
                buffer = numberToAmount.get(num1);
                buffer++;
                numberToAmount.put(num1, buffer);
            } else {
                numberToAmount.put(num1, 1);
            }
        }

        for (int num2 : nums2) {
            if (numberToAmount.containsKey(num2) && numberToAmount.get(num2) > 0) {
                buffer = numberToAmount.get(num2);
                buffer--;
                numberToAmount.put(num2, buffer);
                result.add(num2);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
