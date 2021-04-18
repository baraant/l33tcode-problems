package com.github.kollaps92.l33tcode.data_structures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class SquaresOfASortedArrayTests {

    private SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();


    @Test
    public void test_1() {

        int[] intArray1 = IntStream.of(-5, -3, -2, 0, 5, 6, 7, 8, 9, 10).toArray();
        int[] intArray2 = IntStream.of(-5, 0).toArray();
        int[] intArray3 = IntStream.of(-5).toArray();
        int[] intArray4 = IntStream.of(-5, -3, 10).toArray();

        Assertions.assertEquals(2, squaresOfASortedArray.findIndexOfLastNegativeValue(intArray1, 0, intArray1.length - 1));
        Assertions.assertEquals(0, squaresOfASortedArray.findIndexOfLastNegativeValue(intArray2, 0, intArray2.length - 1));
        Assertions.assertEquals(0, squaresOfASortedArray.findIndexOfLastNegativeValue(intArray3, 0, intArray3.length - 1));
        Assertions.assertEquals(1, squaresOfASortedArray.findIndexOfLastNegativeValue(intArray4, 0, intArray4.length - 1));
    }

    @Test
    public void test_2() {
        int[] result = squaresOfASortedArray.sortedSquares(IntStream.of(-4, -1, 0, 3, 10).toArray());
    }

    @Test
    public void test_3() {
        int[] result = squaresOfASortedArray.sortedSquares(IntStream.of(-1).toArray());
    }

    @Test
    public void test_4() {
        int[] result = squaresOfASortedArray.sortedSquares(IntStream.of(-5, -3, -2, -1).toArray());
    }

}
