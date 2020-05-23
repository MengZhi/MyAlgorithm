package com.company.unitTest;

import com.company.Solution33;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution33Test {
    Solution33 solution33 = new Solution33();

    @Test
    public void testCase1() {
        int[] nums = {5,6,7,8,9,1,0};
        Assert.assertEquals(solution33.search(nums, 1), 5);
    }

    @Test
    public void testCase2() {
        int[] nums = {4,5,6,7,0,1,2};
        Assert.assertEquals(solution33.search(nums, 0), 4);
    }

    @Test
    public void testCase3() {
        int[] nums = {4,5,6,7,0,1,2};
        Assert.assertEquals(solution33.search(nums, 3), -1);
    }
}