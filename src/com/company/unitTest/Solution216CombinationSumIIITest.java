package com.company.unitTest;

import com.company.Solution216CombinationSumIII;
import org.junit.Assert;
import org.junit.Test;

public class Solution216CombinationSumIIITest {

    @Test
    public void testCase1() {
        int k = 3;
        int n = 7;
        Assert.assertEquals(Solution216CombinationSumIII.combinationSum3(k, n).size(), 1);
    }

    @Test
    public void testCase2() {
        int k = 3;
        int n = 9;
        Assert.assertEquals(Solution216CombinationSumIII.combinationSum3(k, n).size(), 3);
    }
}