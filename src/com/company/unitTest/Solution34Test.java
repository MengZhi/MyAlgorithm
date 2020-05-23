package com.company.unitTest;

import com.company.Solution34;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution34Test {

    @Test
    public void testCase1() {
        int[] nums = {5,7,7,8,8,10};
        int[] res = Solution34.searchRange(nums, 8);
        Assert.assertEquals(res[0], 3);
        Assert.assertEquals(res[1], 4);
    }

    @Test
    public void testCase2() {
        int[] nums = {5,7,7,8,8,10};
        int[] res = Solution34.searchRange(nums, 6);
        Assert.assertEquals(res[0], -1);
        Assert.assertEquals(res[1], -1);
    }

    @Test
    public void testCase3() {
        int[] nums = {0};
        int[] res = Solution34.searchRange(nums, 0);
        Assert.assertEquals(res[0], 0);
        Assert.assertEquals(res[1], 0);
    }

    @Test
    public void testCase4() {
        int[] nums = {};
        int[] res = Solution34.searchRange(nums, 1);
        Assert.assertEquals(res[0], -1);
        Assert.assertEquals(res[1], -1);
    }
}