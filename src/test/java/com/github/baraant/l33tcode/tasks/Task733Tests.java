package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task733Tests {

    @Test
    public void test733_1() {
        Task733 task733 = new Task733();

        int[][] num = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};


        task733.floodFill(num, 1, 1, 2);
        System.out.println("asd");
    }

    @Test
    public void test733_2() {
        Task733 task733 = new Task733();

        int[][] num = {{0, 0, 0}, {0, 0, 0}};


        task733.floodFill(num, 0, 0, 2);
        System.out.println("asd");
    }

    @Test
    public void test733_3() {
        Task733 task733 = new Task733();

        int[][] num = {{0, 0, 0}, {0, 1, 1}};


        task733.floodFill(num, 1, 1, 1);
        System.out.println("asd");
    }
}
