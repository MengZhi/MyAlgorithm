package com.company.unitTest;

import com.company.Solution162findPeakElement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution162findPeakElementTest {

    @Test
    public void test1() {
        int[] nums = {1,2,3,1};
        Assert.assertEquals(Solution162findPeakElement.findPeakElement(nums), 2);
    }

    @Test
    public void test2() {
        int[] nums = {1,2,1,3,5,6,4};
        Assert.assertEquals(Solution162findPeakElement.findPeakElement(nums), 1);
    }

    @Test
    public void test3() {
        int[] nums = {1,2,3,4,5,6,7};
        Assert.assertEquals(Solution162findPeakElement.findPeakElement(nums), 6);
    }
}