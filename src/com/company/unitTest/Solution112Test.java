package com.company.unitTest;

import com.company.Solution112;
import com.company.TreeNode;
<<<<<<< HEAD
=======
>>>>>>> add project
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.company.Main.initBinTree;
<<<<<<< HEAD
=======
>>>>>>> add project

public class Solution112Test {
    Solution112 solution112 = new Solution112();

    @Test
    public void testCase1() {
        List<Integer> list = Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,null,1);
        TreeNode root = initBinTree(list);
        Assert.assertTrue(solution112.hasPathSum(root, 22));
        Assert.assertTrue(solution112.hasPathSum2(root, 22));
    }

    @Test
    public void testCase2() {
        List<Integer> list = Arrays.asList();
        TreeNode root = initBinTree(list);
        Assert.assertFalse(solution112.hasPathSum(root, 1));
        Assert.assertFalse(solution112.hasPathSum2(root, 1));
    }

    @Test
    public void testCase3() {
        List<Integer> list = null;
        TreeNode root = initBinTree(list);
        Assert.assertFalse(solution112.hasPathSum(root, 1));
        Assert.assertFalse(solution112.hasPathSum2(root, 1));
    }

    @Test
    public void testCase4() {
        List<Integer> list = Arrays.asList(2);
        TreeNode root = initBinTree(list);
        Assert.assertTrue(solution112.hasPathSum(root, 2));
        Assert.assertTrue(solution112.hasPathSum2(root, 2));
    }
}