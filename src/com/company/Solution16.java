package com.company;

import java.util.Arrays;

public class Solution16 {
    public void test() {
        //int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {-1, 2, 1, -4};
        System.out.print(threeSumClosest2(nums2, 1));
    }

    public int threeSumClosest2(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int res = 0;
        for (int k = 0; k < nums.length - 2; k++) {
            int first = k + 1;
            int last = nums.length - 1;
            while (first < last) {
                int sum = nums[k] + nums[first] + nums[last];
                if (sum < target) {
                    first++;
                } else if (sum > target) {
                    last--;
                }
                if (Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    res = sum;
                }
                if (sum == target) {
                    return sum;
                }
            }
        }
        return res;
    }


    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        int first = 1;
        int last = nums.length - 1;
        Arrays.sort(nums);
        for (int k = 0; k < nums.length; k++) {
            first = k + 1;
            last = nums.length - 1;
            while (first < last) {
                int sum = nums[k] + nums[first] + nums[last];
                if (Math.abs(sum - target) < diff) {
                    ans = sum;
                    diff = Math.abs(sum - target);
                }
                if (sum < target) {
                    first++;
                } else if (sum > target) {
                    last--;
                } else {
                    return ans;
                }
            }

        }
        return ans;
    }
}
