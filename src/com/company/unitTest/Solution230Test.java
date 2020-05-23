package com.company.unitTest;

import com.company.Solution230;
import com.company.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.company.Main.initBinTree;

public class Solution230Test {
    Solution230 solution230 = new Solution230();

    @Test
    public void case1() {
        List<Integer> list = Arrays.asList(5,3,6,2,4,null,null,1);
        TreeNode root = initBinTree(list);
        Assert.assertEquals(solution230.kthSmallest(root, 3), 3);
    }

    @Test
    public void case2() {
        List<Integer> list = Arrays.asList(3,1,4,null,2);
        TreeNode root = initBinTree(list);
        Assert.assertEquals(solution230.kthSmallest(root, 1), 1);
    }
}