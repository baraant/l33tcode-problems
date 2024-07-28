package com.github.baraant.l33tcode.data_structures.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArrayTests {

    RotateArray ra = new RotateArray();

    @Test
    public void test() {

        int[] nums = IntStream.of(1,2,3,4,5,6,7).toArray();
        ra.rotate(nums, 3);

        System.out.println(Arrays.toString(nums));
    }
}
