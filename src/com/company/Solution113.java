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
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        DFS2(root, temp, result, sum);

        return result;
    }


    void DFS2(TreeNode root, List<Integer> temp, List<List<Integer>> result, int sum) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        sum -= root.val;

        if (root.left == null && root.right == null && sum == 0) {
            result.add(new ArrayList<>(temp));
            //return;
        }
        DFS2(root.left, temp, result, sum);
        DFS2(root.right, temp, result, sum);
        temp.remove(temp.size() - 1);
    }


    void DFS(TreeNode root, List<Integer> temp, List<List<Integer>> result, int sum) {
        if (root == null) {
            return;
        }
        int diff = sum - root.val;

        temp.add(root.val);

        if (root.left == null && root.right == null) {
            if (diff == 0) {
                result.add(temp);
                return;
            } else {
                return;
            }
        }
        DFS(root.left, new ArrayList<>(temp), result, diff);
        DFS(root.right, new ArrayList<>(temp), result, diff);
        temp.remove(temp.size() - 1);
    }

}
