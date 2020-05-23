package com.company.unitTest;

import com.company.Solution437;
import com.company.Solution687;
import com.company.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.company.Main.initBinTree;
import static org.junit.Assert.*;

public class Solution687Test {

    @Test
    public void testCase1() {
        List<Integer> list = Arrays.asList(5,4,5,1,1,5);
        TreeNode root = initBinTree(list);
        Solution687 solution687 = new Solution687();
        Assert.assertEquals(solution687.longestUnivaluePath(root), 2);
    }

    @Test
    public void testCase2() {
        List<Integer> list = Arrays.asList(1,4,5,4,4,null,5);
        TreeNode root = initBinTree(list);
        Solution687 solution687 = new Solution687();
        Assert.assertEquals(solution687.longestUnivaluePath(root), 2);
    }

    @Test
    public void testCase3() {
        List<Integer> list = Arrays.asList(5,4,5,4,4,null,5,null,null,null,null,5);
        TreeNode root = initBinTree(list);
        Solution687 solution687 = new Solution687();
        Assert.assertEquals(solution687.longestUnivaluePath(root), 3);
    }

    @Test
    public void testCase4() {
        List<Integer> list = Arrays.asList(2,2,2,2,null,null,2);
        TreeNode root = initBinTree(list);
        Solution687 solution687 = new Solution687();
        Assert.assertEquals(solution687.longestUnivaluePath(root), 4);
    }
}