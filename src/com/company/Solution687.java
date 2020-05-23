/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：
 * <p>
 * 答案中不可以包含重复的四元组。
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 * <p>
 * 满足要求的四元组集合为：
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

package com.company;


import java.util.Map;

public class Solution687 {
    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        helper(root, root.val);
        return max;
    }

    private int helper(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left, root.val);
        int right = helper(root.right, root.val);

        max = Math.max(max, left+right);

        if (root.val == val) {
            return Math.max(left, right)+1;
        }

        return 0;
    }
//    private int helper(TreeNode root, int val) {
//        if (root == null) {
//            return 0;
//        }
//        int left = helper(root.left, root.val);
//        int right = helper(root.right, root.val);
//
//        max = Math.max(left, right);
//
//        if (root.val == val) {
//            max += 1;
//        }
//
//        return max;
//    }


}
