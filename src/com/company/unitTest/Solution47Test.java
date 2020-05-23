package com.company.unitTest;

import com.company.Solution46;
import com.company.Solution47;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution47Test {

    @Test
    public void permuteUnique() {
        int[] array = {1,1,2};
        List<List<Integer>> result = Solution47.permuteUnique(array);
        Assert.assertEquals(result.size(), 3);
    }
}