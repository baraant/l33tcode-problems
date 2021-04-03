package com.github.kollaps92.l33tcode;

public class Task66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        boolean cornerCase = true;
        boolean needToAddOne = true;

        for (int i = 0; i <= length - 1; i++) {
            if (digits[i] != 9) {
                cornerCase = false;
                break;
            }
        }

        if (cornerCase) {
            int[] result = new int[length + 1];
            result[0] = 1;
            for (int j = 1; j <= length - 1; j++) {
                result[j] = 0;
            }
            return result;
        }

        for (int k = length - 1; k >= 0; k--) {
            if (!needToAddOne) continue;

            needToAddOne = false;
            if (digits[k] != 9) {
                digits[k]++;
            } else {
                if (digits[k] == 9) {
                    digits[k] = 0;
                    needToAddOne = true;
                }
            }
        }

        return digits;
    }
}
