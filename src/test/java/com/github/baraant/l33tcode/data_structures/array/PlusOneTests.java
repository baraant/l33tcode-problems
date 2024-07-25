package com.github.baraant.l33tcode.data_structures.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOneTests {

    PlusOne po = new PlusOne();

    @Test
    public void test() {
        int[] m = IntStream.of(1, 2, 2, 3, 2, 9, 9).toArray();

        System.out.println(Arrays.toString(po.plusOne(m)));
    }

    @Test
    public void test_2() {
        int[] m = IntStream.of(9).toArray();

        System.out.println(Arrays.toString(po.plusOne(m)));
    }

    @Test
    public void test_3() {
        int[] m = IntStream.of(9,8,7,6,5,4,3,2,1,0).toArray();

        System.out.println(Arrays.toString(po.plusOne(m)));
    }
}