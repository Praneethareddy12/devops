package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 2);
        System.out.println("Test result: " + result); // This will appear in Console Output
        assertEquals(5, result);
    }
    @Test
    public void testsubtract() {
        Calculator calc1 = new Calculator();
        int result1 = calc1.subtract(3, 2);
        System.out.println("Test result: " + result1);
        assertEquals(1, result1);
    }
}
