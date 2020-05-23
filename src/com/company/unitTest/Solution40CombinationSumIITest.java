package com.company.unitTest;

import com.company.Solution39CombinationSum;
import com.company.Solution40CombinationSumII;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution40CombinationSumIITest {

    @Test
    public void testCase1() {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Assert.assertEquals(Solution40CombinationSumII.combinationSum2(candidates, target).size(), 4);
    }

    @Test
    public void testCase2() {
        int[] candidates = {2,5,2,1,2};
        int target = 5;
        Assert.assertEquals(Solution40CombinationSumII.combinationSum2(candidates, target).size(), 2);
    }
}