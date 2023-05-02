package com.subhayan.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

//    private final Calculator calc = new Calculator();
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }  // This method runs before each test so we get a fresh object for each test run

    @Test
    public void canAddZeroPlusZero() {
        int sum = calc.add(0, 0);
        assertEquals(0, sum, "Was expecting sum of 0!");
    }

    @Test
    public void canAddOnePlusOne() {
        int sum = calc.add(1, 1);
        assertEquals(2, sum, "Was expecting sum of 2!");
    }

    @Test
    @Disabled
    public void canMaxIntPlusOne() {
        int sum = calc.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE + 1L, sum);
    }

}
