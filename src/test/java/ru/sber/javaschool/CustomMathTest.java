package ru.sber.javaschool;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomMathTest {
    private CustomMath customMath = new CustomMath();

    @Test
    public void sum() {
        Assert.assertEquals(24, customMath.sum(5,19),0);
    }

    @Test
    public void multiply() {
        Assert.assertEquals(10.4, customMath.multiply(5.2,2),0);
    }

    @Test
    public void divide() {
        Assert.assertEquals(1.66,customMath.divide(5,3), 0.01);
    }

    @Test
    public void deduction() {
        Assert.assertEquals(6,customMath.deduction(25,19), 0);
    }
}