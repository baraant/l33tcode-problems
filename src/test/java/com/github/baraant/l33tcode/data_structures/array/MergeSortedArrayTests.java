package com.github.baraant.l33tcode.data_structures.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class MergeSortedArrayTests {

    MergeSortedArray msa = new MergeSortedArray();


    @Test
    public void test() {
        int[] m = IntStream.of(0, 1, 2, 3, 0, 0, 0).toArray();
        int[] n = IntStream.of(2, 6, 10).toArray();


        msa.merge(m, 4, n, n.length);
        System.out.println("hi");
    }

    @Test
    public void test_2() {
        int[] m = IntStream.of(2, 0).toArray();
        int[] n = IntStream.of(1).toArray();


        msa.merge(m, 1, n, n.length);
        System.out.println("hi");
    }

    @Test
    public void test_3() {
        int[] m = IntStream.of(4, 5, 6, 0, 0, 0).toArray();
        int[] n = IntStream.of(1, 2, 3).toArray();


        msa.merge(m, 3, n, n.length);
        System.out.println("hi");
    }
}
