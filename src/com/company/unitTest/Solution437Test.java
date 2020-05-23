package com.company.unitTest;

import com.company.Solution437;
import com.company.TreeNode;
import org.junit.Assert;

import java.util.*;

import static com.company.Main.initBinTree;

public class Solution437Test {

    @org.junit.Test
    public void testCase437() {
        List<Integer> list = Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
        TreeNode root = initBinTree(list);
        Solution437 solution437 = new Solution437();
        Assert.assertEquals(solution437.pathSum2(root, 8),3);
    }
}