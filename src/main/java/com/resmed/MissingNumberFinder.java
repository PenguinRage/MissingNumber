package com.resmed;

public class MissingNumberFinder {

    public int findMissingNumber(int[] list) {
        // Math formula to calculate Summation of numbers: n * (n+1)/2
        int n = list.length + 1;
        int sumTotal = (n * (n + 1)) / 2;

        for (final int value : list) {
            sumTotal -= value;
        }

        return sumTotal;
    }
}
