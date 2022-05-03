package com.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Before
    public void setUp() throws Exception {
    }


    //  Step 1 ------------------
    @Test
    public void emptyStringShouldReturnZero() {
        StringCalculator stringCalculator=new StringCalculator();
        Assert.assertEquals(0, stringCalculator.add(""));
    }
}