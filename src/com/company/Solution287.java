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


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution287 {
    public void test() {
        int[] nums = {1,3,4,2,2};
        System.out.print(findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length-1;
        int mid=0;
        while(low < high){
            mid = (low + high)/2;
            int counter=0;
            for(int i:nums){
                if(i <= mid) counter++;
            }
            if(counter > mid) high = mid;
            else low = mid+1;
        }
        return low;
    }

}
