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

import java.util.ArrayList;
import java.util.List;

public class Solution437_1 {
    int result = 0;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(root, result, temp, sum, false);
        return result;
    }

    void helper(TreeNode root, List<List<Integer>> result, List<Integer> temp, int sum, boolean accessed) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (sum - root.val == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        helper(root.left, result, temp, sum - root.val, true);

        temp.clear();
        temp.add(root.val);

        helper(root.right, result, temp, sum - root.val, true);
        if (accessed == false) {
            helper(root.left, result, new ArrayList<>(), sum, false);
            helper(root.right, result, new ArrayList<>(), sum, false);
        }
    }

}
