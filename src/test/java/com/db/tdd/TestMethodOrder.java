package com.db.tdd;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by Akshay on 22-09-2020.
 */

/**We can write our own method sorters
* */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMethodOrder {

    @Test
    public void testZ() {
        System.out.println("Z");
    }

    @Test
    public void testY() {
        System.out.println("Y");
    }

    @Test
    public void testA() {
        System.out.println("A");
    }

    @Test
    public void testM() {
        System.out.println("M");
    }

    @Test
    public void test1() {
        System.out.println("1");
    }
}
