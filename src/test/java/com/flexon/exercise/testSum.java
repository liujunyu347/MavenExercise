package com.flexon.exercise;

import org.junit.Test;

import static org.junit.Assert.*;


public class testSum {
    @Test
    public void TestSum(){
        Calculator calculator = new Calculator();
        System.out.println("sum");
        Integer x = 15;
        Integer y = 15;
        Integer expResult = 30;
        Integer result = calculator.sum(x, y);
        assertEquals(expResult, result);
        assertNull(calculator.sum(15, null));
        assertNull(null, calculator.sum(null, 15));
        assertNull(null, calculator.sum(null, null));
    }


}
