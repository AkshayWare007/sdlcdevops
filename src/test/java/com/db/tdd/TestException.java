package com.db.tdd;

import org.junit.Test;

/**
 * Created by Akshay on 22-09-2020.
 */
public class TestException {

    @Test(expected = ArithmeticException.class)
    public void divideByZero() {
        double b = 100/0;
    }
}
