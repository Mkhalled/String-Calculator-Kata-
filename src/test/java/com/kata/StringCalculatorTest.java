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

    @Test
    public void oneNumberShouldReturnItself() {
        StringCalculator stringCalculator=new StringCalculator();
        Assert.assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void stringNotSupported() {
        StringCalculator stringCalculator=new StringCalculator();
        try {
            stringCalculator.add("Test");
        } catch (IllegalArgumentException e) {
            assertEquals("Test not allowed", e.getMessage());
        }
    }
}