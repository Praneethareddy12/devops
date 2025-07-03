package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        System.out.println("Test result: " + result); // This will appear in Console Output
        assertEquals(5, result);
    }
}
