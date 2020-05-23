package com.company.unitTest;

import com.company.Solution46;
import com.company.Solution77Combinations;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution77CombinationsTest {
    @Test
    public void testCase1() {
        List<List<Integer>> result = Solution77Combinations.combine(4, 2);
        Assert.assertEquals(result.size(), 6);
    }

}