package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution56mergeTest {

    @Test
    public void merge() {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        Solution56merge solution56merge = new Solution56merge();
        int[][] res = solution56merge.merge(input);
        int[][] exp = {{1,6},{8,10},{15,18}};
        Assert.assertEquals(exp, res);
    }
}