/**
 * 113. 路径总和 II
 * <p>
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 * <p>
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \    / \
 * 7    2  5   1
 * 返回:
 * <p>
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 */


package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList();
        String temp = "";
        DFS(result, temp, root);
        return result;
    }

    void DFS(List<String> result, String temp, TreeNode root) {
        if (root == null) {
            return;
        }
        temp += root.val + "->";
        if (root.right == null && root.left == null) {
            result.add(temp);
        }
        DFS(result, new String(temp), root.left);
        DFS(result, new String(temp), root.right);
    }

}
