package com.github.kollaps92.l33tcode.data_structure_array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class DuplicateZerosTests {

    protected DuplicateZeros duplicateZeros = new DuplicateZeros();

    @Test
    public void test_casual() {
        int[] arr = IntStream.of(1, 0, 2, 5, 6).toArray();
        duplicateZeros.duplicateZeros(arr);
        printArray(arr);
    }

    @Test
    public void test_singleElement() {
        int[] arr = IntStream.of(0).toArray();
        duplicateZeros.duplicateZeros(arr);
        printArray(arr);
    }

    @Test
    public void test_singleElementNonZero() {
        int[] arr = IntStream.of(1).toArray();
        duplicateZeros.duplicateZeros(arr);
        printArray(arr);
    }

    @Test
    public void test_13() {
        int[] arr = IntStream.of(1, 0, 2, 3, 0, 4, 5, 0).toArray();
        duplicateZeros.duplicateZeros(arr);
        printArray(arr);
    }

    private void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
}
