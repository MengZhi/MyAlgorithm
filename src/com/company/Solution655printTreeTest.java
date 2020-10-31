package com.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution655printTreeTest {

    @Test
    public void printTree() {
        List<Integer> root = Arrays.asList(1,2,3,null, 4, null, null);
        TreeNode treeRoot = Main.initBinTree(root);
        Solution655printTree solution655printTree = new Solution655printTree();
        solution655printTree.printTree(treeRoot);
    }
}