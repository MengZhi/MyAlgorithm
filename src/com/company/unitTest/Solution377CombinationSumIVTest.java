package com.company.unitTest;

import com.company.Solution377CombinationSumIV;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution377CombinationSumIVTest {

    @Test
    public void testCase1() {
        int[] candidates = {1,2,3};
        int target = 4;
        Assert.assertEquals(Solution377CombinationSumIV.combinationSum2(candidates, target).size(), 7);
    }

    @Test
    public void testCase2() {
        int[] candidates = {4,2,1};
        int target = 32;
        Assert.assertEquals(Solution377CombinationSumIV.combinationSum2(candidates, target).size(), 39882198);
    }
}