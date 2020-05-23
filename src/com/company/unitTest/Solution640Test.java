package com.company.unitTest;

import com.company.Solution640;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution640Test {

    @Test
    public void testCase1() {
        String input = "x+5-3+x=6+x-2";
        Assert.assertEquals(Solution640.solveEquation(input), "x=2");
    }

    @Test
    public void testCase2() {
        String input = "x=x";
        Assert.assertEquals(Solution640.solveEquation(input), "Infinite solutions");
    }

    @Test
    public void testCase3() {
        String input = "2x=x";
        Assert.assertEquals(Solution640.solveEquation(input), "x=0");
    }

    @Test
    public void testCase4() {
        String input = "2x+3x-6x=x+2";
        Assert.assertEquals(Solution640.solveEquation(input), "x=-1");
    }

    @Test
    public void testCase5() {
        String input = "x=x+2";
        Assert.assertEquals(Solution640.solveEquation(input), "No solution");
    }
}