package com.github.baraant.l33tcode.tasks;

/*
67. Add Binary
Easy
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

Constraints:

1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/
public class Task67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int len1 = a.length();
        int len2 = b.length();

        int ind1 = len1 - 1;
        int ind2 = len2 - 1;
        boolean addOne = false;

        while (ind1 >= 0 && ind2 >= 0) {
            int val1 = a.charAt(ind1) - '0';
            int val2 = b.charAt(ind2) - '0';

            int cur = val1 + val2;

            if (addOne) cur++;

            if (cur > 1) {
                addOne = true;
                sb.append(cur - 2);
            } else {
                addOne = false;
                sb.append(cur);
            }

            ind1--;
            ind2--;
        }

        while (ind1 >= 0) {
            int val1 = a.charAt(ind1) - '0';

            if (addOne) {
                val1++;
            }

            if (val1 > 1) {
                addOne = true;
                sb.append(val1 - 2);
            } else {
                addOne = false;
                sb.append(val1);
            }

            ind1--;
        }

        while (ind2 >= 0) {
            int val2 = b.charAt(ind2) - '0';

            if (addOne) {
                val2++;
            }

            if (val2 > 1) {
                addOne = true;
                sb.append(val2 - 2);
            } else {
                addOne = false;
                sb.append(val2);
            }

            ind2--;

        }

        if (addOne) {
            sb.append(1);
        }

        sb.reverse();

        return sb.toString();
    }
}
