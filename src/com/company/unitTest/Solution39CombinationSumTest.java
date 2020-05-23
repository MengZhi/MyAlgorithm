package com.company.unitTest;

import com.company.Solution39CombinationSum;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution39CombinationSumTest {

    @Test
    public void testCase1() {
        int[] candidates = {2,3,6,7};
        int target = 7;
        Assert.assertEquals(Solution39CombinationSum.combinationSum(candidates, target).size(), 2);
    }

    @Test
    public void testCase2() {
        int[] candidates = {2,3,5};
        int target = 8;
        Assert.assertEquals(Solution39CombinationSum.combinationSum(candidates, target).size(), 3);
    }
}