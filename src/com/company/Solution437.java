/**
 * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 * <p>
 * 说明：
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: root = [3,1,4,null,2], k = 1
 * 3
 * / \
 * 1   4
 * \
 *    2
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 * 5
 * / \
 * 3   6
 * / \
 * 2   4
 * /
 * 1
 * 输出: 3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


package com.company;

import apple.laf.JRSUIUtils;

import java.util.*;

public class Solution437 {
    int result = 0;
    public int pathSum2(TreeNode root, int sum) {

        helper(root, sum, false);
        return result;
    }

    void helper(TreeNode root, int sum, boolean accessed) {
        if (root == null) {
            return;
        }
        if (sum - root.val== 0) result++;
        helper(root.left, sum - root.val, true);
        helper(root.right, sum - root.val, true);
        if (accessed == false) {
            helper(root.left, sum, false);
            helper(root.right, sum, false);
        }
    }


    int pathnumber;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        Sum(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return pathnumber;
    }


    public void Sum(TreeNode root, int sum) {
        if (root == null) return;
        sum -= root.val;
        if (sum == 0) {
            pathnumber++;
        }
        Sum(root.left, sum);
        Sum(root.right, sum);
    }

}
