package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    private Solution1 solution = new Solution1();

    @Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);
        Assert.assertEquals(result[0], 0);
        Assert.assertEquals(result[1], 1);
    }

    @Test
    public void test2() {
        int[] nums = {2, 7, 11, 15};
        int target = 18;

        int[] result = solution.twoSum(nums, target);
        Assert.assertEquals(result[0], 1);
        Assert.assertEquals(result[1], 2);
    }

    @Test
    public void test3() {
        int[] nums = {3, 3};
        int target = 6;

        int[] result = solution.twoSum(nums, target);
        Assert.assertEquals(result[0], 0);
        Assert.assertEquals(result[1], 1);
    }
}