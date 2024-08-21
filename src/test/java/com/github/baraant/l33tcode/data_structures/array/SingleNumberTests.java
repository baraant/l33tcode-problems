package com.github.baraant.l33tcode.data_structures.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class SingleNumberTests {

    SingleNumber sn = new SingleNumber();

    @Test
    public void test() {
        int[] nums = IntStream.of(2,5,3,3,2).toArray();
        System.out.println(sn.singleNumber(nums));
    }

    @Test
    public void test_02() {
        int[] nums = IntStream.of(2,2,1).toArray();
        System.out.println(sn.singleNumber(nums));
    }

    @Test
    public void test_03() {
        int[] nums = IntStream.of(4,1,2,1,2).toArray();
        System.out.println(sn.singleNumber(nums));
    }

    @Test
    public void test_04() {
        int[] nums = IntStream.of(1).toArray();
        System.out.println(sn.singleNumber(nums));
    }
}
