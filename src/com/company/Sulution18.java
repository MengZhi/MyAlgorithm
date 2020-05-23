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


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sulution18 {
    public void test() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int[] nums2 = {-3, -2, -1, 0, 0, 1, 2, 3};
        int[] nums3 = {-1, 0, 1, 2, -1, -4};
        int[] num4 = {1, -2, -5, -4, -3, 3, 3, 5};
        int[] num5 = {-1, -5, -5, -3, 2, 5, 0, 4};
        System.out.print(fourSum2(nums, 0));
    }

    public List<List<Integer>> fourSum2(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int hhead = 0; hhead < nums.length - 3; hhead++) {
            if (hhead > 0 && nums[hhead] == nums[hhead - 1]) {
                continue;
            }
            for (int head = hhead + 1; head < nums.length - 2; head++) {
                if (head - hhead > 1 && nums[head] == nums[head - 1]) {
                    continue;
                }
                int third = head + 1;
                int last = nums.length - 1;
                while (third < last) {
                    int sum = nums[hhead] + nums[head] + nums[third] + nums[last];
                    if (sum < target) {
                        while (third < last && nums[third] == nums[++third]) ;
                    } else if (sum > target) {
                        while (third < last && nums[last] == nums[--last]) ;
                    } else {
                        result.add(Arrays.asList(nums[hhead], nums[head], nums[third], nums[last]));
                        while (third < last && nums[third] == nums[++third]) ;
                        while (third < last && nums[last] == nums[--last]) ;
                    }
                }
            }
        }
        return result;
    }


    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int third = 0;
        int last = 0;
        for (int head = 0; head < nums.length - 3; head++) {
            if (head > 0 && nums[head] == nums[head - 1]) {
                continue;
            }
            for (int secondHead = head + 1; secondHead < nums.length - 1; secondHead++) {
                if (secondHead - head > 1 && nums[secondHead] == nums[secondHead - 1]) {
                    continue;
                }
                third = secondHead + 1;
                last = nums.length - 1;
                while (third < last) {
                    int sum = nums[head] + nums[secondHead] + nums[third] + nums[last];
                    if (sum < target) {
                        while (third < last && nums[third] == nums[++third]) ;
                    } else if (sum > target) {
                        while (third < last && nums[last] == nums[--last]) ;
                    } else {
                        List<Integer> temp = Arrays.asList(nums[head], nums[secondHead], nums[third], nums[last]);
                        result.add(temp);
                        while (third < last && nums[third] == nums[++third]) ;
                        while (third < last && nums[last] == nums[--last]) ;
                    }
                }
            }
        }
        return result;
    }
}
