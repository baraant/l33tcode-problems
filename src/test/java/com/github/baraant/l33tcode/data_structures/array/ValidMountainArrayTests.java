package com.github.baraant.l33tcode.data_structures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ValidMountainArrayTests {

    ValidMountainArray vma = new ValidMountainArray();

    @Test
    public void test() {
        // [0,1,2,3,4,5,6,7,8,9]

        int[] arr = IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).toArray();
        Assertions.assertFalse(vma.validMountainArray(arr));

    }
}
