package com.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.company.Main.initBinTree;
import static org.junit.Assert.*;

public class MaxValueForLayersTest {

    @Test
    public void getMaxValueForLayers() {
        List<Integer> list = Arrays.asList(1,3,2,5,3,null, 9);
        TreeNode root = initBinTree(list);
        MaxValueForLayers maxValueForLayers = new MaxValueForLayers();
        maxValueForLayers.getMaxValueForLayers(root);

    }
}