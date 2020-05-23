package com.company.unitTest;

import com.company.Solution113;
import com.company.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.company.Main.initBinTree;
import static org.junit.Assert.*;

public class Solution113Test {
    Solution113 solution113 = new Solution113();

    @Test
    public void testCase1() {
        List<Integer> list = Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,5,1);
        TreeNode root = initBinTree(list);

        Assert.assertEquals(solution113.pathSum(root, 22).size(), 2);

    }

    @Test
    public void testCase2() {
        List<Integer> list = Arrays.asList();
        TreeNode root = initBinTree(list);

    }

    @Test
    public void testCase3() {
        List<Integer> list = null;
        TreeNode root = initBinTree(list);

    }

    @Test
    public void testCase4() {
        List<Integer> list = Arrays.asList(2);
        TreeNode root = initBinTree(list);

    }
}