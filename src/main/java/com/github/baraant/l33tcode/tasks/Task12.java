package com.github.baraant.l33tcode.tasks;

/*
12. Integer to Roman
Medium
Seven different symbols represent Roman numerals with the following values:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:

If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
Given an integer, convert it to a Roman numeral.

Example 1:

Input: num = 3749

Output: "MMMDCCXLIX"

Explanation:

3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
Example 2:

Input: num = 58

Output: "LVIII"

Explanation:

50 = L
 8 = VIII
Example 3:

Input: num = 1994

Output: "MCMXCIV"

Explanation:

1000 = M
 900 = CM
  90 = XC
   4 = IV

Constraints:

1 <= num <= 3999
*/
public class Task12 {
    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();

        int first = num / 1000;
        int second = num % 1000 / 100;
        int third = num % 100 / 10;
        int fourth = num % 10;

        for (int i = 1; i <= first; i++) {
            sb.append('M');
        }

        sb.append(intToRomanHelper(second, 'M', 'D', 'C'));
        sb.append(intToRomanHelper(third, 'C', 'L', 'X'));
        sb.append(intToRomanHelper(fourth, 'X', 'V', 'I'));

        return sb.toString();
    }

    private String intToRomanHelper(int digit, char tenth, char fifth, char ones) {
        return switch (digit) {
            case 9 -> "" + ones + tenth;
            case 8 -> "" + fifth + ones + ones + ones;
            case 7 -> "" + fifth + ones + ones;
            case 6 -> "" + fifth + ones;
            case 5 -> "" + fifth;
            case 4 -> "" + ones + fifth;
            case 3 -> "" + ones + ones + ones;
            case 2 -> "" + ones + ones;
            case 1 -> "" + ones;
            default -> "";
        };
    }
}
