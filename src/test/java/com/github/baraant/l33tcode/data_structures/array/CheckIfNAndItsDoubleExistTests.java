package com.github.baraant.l33tcode.data_structures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class CheckIfNAndItsDoubleExistTests {

    CheckIfNAndItsDoubleExist cinaide = new CheckIfNAndItsDoubleExist();

    @Test
    public void test() {

        int[] arr = IntStream.of(1, 2, 3, 4, 5, 6, 7).toArray();

        Assertions.assertTrue(cinaide.checkIfExist(arr));
    }

    @Test
    public void test_2() {

        int[] arr = IntStream.of(1, 5).toArray();

        Assertions.assertFalse(cinaide.checkIfExist(arr));
    }

    @Test
    public void test_3() {

        int[] arr = IntStream.of(1, 5, 2).toArray();

        Assertions.assertTrue(cinaide.checkIfExist(arr));
    }

    //[-10,12,-20,-8,15]

    @Test
    public void test_4() {

        int[] arr = IntStream.of(-10, 12, -20, -8, 15).toArray();

        Assertions.assertTrue(cinaide.checkIfExist(arr));
    }

    @Test
    public void test_5() {
        int[] arr = IntStream.of(-2, 0, 10, -19, 4, 6, -8).toArray();

        Assertions.assertFalse(cinaide.checkIfExist(arr));

    }

    @Test
    public void test_6() {
        int[] arr = IntStream.of(0, 0).toArray();

        Assertions.assertTrue(cinaide.checkIfExist(arr));

    }
}
