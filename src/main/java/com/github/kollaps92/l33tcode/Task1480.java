package com.github.kollaps92.l33tcode;

class Task1480 {
    public int[] runningSum(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}