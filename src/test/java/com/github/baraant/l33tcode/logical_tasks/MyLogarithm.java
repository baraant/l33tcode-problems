package com.github.baraant.l33tcode.logical_tasks;

import org.junit.jupiter.api.Test;

/*
Basic properties of logarithms
log_a(x) = ln(x) / ln(a) = lg(x) / ln(a)
log_a(x) + log_a(y) = log_a(x*y)
log_a(x) - log_a(y) = log_a(x/y)
log_a(x^n) = n * log_a(x)
*/
public class MyLogarithm {

    @Test
    public void asd() {
        double resultDouble = Math.log(2) / Math.log(1.05);
        int result = (int) resultDouble;
        if (resultDouble > result) {
            result++;
        }

        System.out.println(result);
    }
}
