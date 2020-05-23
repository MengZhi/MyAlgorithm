package com.company.unitTest;

import com.company.Solution437;
import com.company.Solution437_1;
import com.company.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.company.Main.initBinTree;
import static org.junit.Assert.*;

public class Solution437_1Test {

    @Test
    public void testCase1() {
        List<Integer> list = Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
        TreeNode root = initBinTree(list);
        Solution437_1 solution437_1 = new Solution437_1();
        Assert.assertEquals(solution437_1.pathSum(root, 8).size(),3);
    }

    @Test
    public void testCase2() {
        List<Integer> list = Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
        TreeNode root = initBinTree(list);
        Solution437_1 solution437_1 = new Solution437_1();
        Assert.assertEquals(solution437_1.pathSum(root, 7).size(),2);
    }
}