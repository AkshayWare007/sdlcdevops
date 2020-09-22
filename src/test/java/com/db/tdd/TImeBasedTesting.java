package com.db.tdd;

import org.junit.Test;

/**
 * Created by Akshay on 22-09-2020.
 */
public class TImeBasedTesting {

    @Test(timeout = 3000)
    public void testCrunchLargeNumbers(){
        new NumberCruncher().cruchLargeNumber();
    }
}
