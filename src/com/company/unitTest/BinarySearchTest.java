package com.company.unitTest;

import com.company.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void searchNumber() {
        int[] nums = {2, 4, 5, 7, 8, 10};
        Assert.assertEquals(BinarySearch.searchNumber(nums, 8), 4);
        Assert.assertEquals(BinarySearch.searchNumber(nums, 10), 5);
        Assert.assertEquals(BinarySearch.searchNumber(nums, 2), 0);
        Assert.assertEquals(BinarySearch.searchNumber(nums, 6), -1);
        Assert.assertEquals(BinarySearch.searchNumber(nums, 0), -1);
        Assert.assertEquals(BinarySearch.searchNumber(nums, 12), -1);
    }

    @Test
    public void leftBound() {
        int[] nums = {5, 5, 7, 7, 8, 8, 10};
        Assert.assertEquals(BinarySearch.leftBound(nums, 8), 4);
        Assert.assertEquals(BinarySearch.leftBound(nums, 10), 6);
        Assert.assertEquals(BinarySearch.leftBound(nums, 5), 0);
        Assert.assertEquals(BinarySearch.leftBound(nums, 7), 2);
        Assert.assertEquals(BinarySearch.leftBound(nums, 0), -1);
        Assert.assertEquals(BinarySearch.leftBound(nums, 12), -1);
    }

    @Test
    public void leftBound2() {
        int[] nums = {5, 5, 7, 7, 8, 8, 10};
        Assert.assertEquals(BinarySearch.leftBound2(nums, 8), 4);
        Assert.assertEquals(BinarySearch.leftBound2(nums, 10), 6);
        Assert.assertEquals(BinarySearch.leftBound2(nums, 5), 0);
        Assert.assertEquals(BinarySearch.leftBound2(nums, 7), 2);
        Assert.assertEquals(BinarySearch.leftBound2(nums, 0), -1);
        Assert.assertEquals(BinarySearch.leftBound2(nums, 12), -1);
    }

    @Test
    public void rightBound() {
        int[] nums = {5, 5, 7, 7, 8, 8, 10};
        Assert.assertEquals(BinarySearch.rightBound(nums, 8), 5);
        Assert.assertEquals(BinarySearch.rightBound(nums, 10), 6);
        Assert.assertEquals(BinarySearch.rightBound(nums, 5), 1);
        Assert.assertEquals(BinarySearch.rightBound(nums, 7), 3);
        Assert.assertEquals(BinarySearch.rightBound(nums, 0), -1);
        Assert.assertEquals(BinarySearch.rightBound(nums, 12), -1);
    }

    @Test
    public void rightBound2() {
        int[] nums = {5, 5, 7, 7, 8, 8, 10};
        Assert.assertEquals(BinarySearch.rightBound2(nums, 8), 5);
        Assert.assertEquals(BinarySearch.rightBound2(nums, 10), 6);
        Assert.assertEquals(BinarySearch.rightBound2(nums, 5), 1);
        Assert.assertEquals(BinarySearch.rightBound2(nums, 7), 3);
        Assert.assertEquals(BinarySearch.rightBound2(nums, 0), -1);
        Assert.assertEquals(BinarySearch.rightBound2(nums, 12), -1);
    }
}