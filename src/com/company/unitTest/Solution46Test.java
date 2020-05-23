package com.company.unitTest;

import com.company.Solution46;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution46Test {

    @Test
    public void permute() {
        int[] array = {1,2,3};
        List<List<Integer>> result = Solution46.permute(array);
        Assert.assertEquals(result.size(), 6);
    }

    @Test
    public void permute2() {
        int[] array = {1,2,3,4};
        List<List<Integer>> result = Solution46.permute(array);
        Assert.assertEquals(result.size(), 24);
    }
}