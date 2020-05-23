package com.company;

import java.util.Arrays;

public class Solution34 {

    public static int[] searchRange(int[] nums, int target) {
        int left = leftBound2(nums, target);
        int right = rightBound2(nums, target);
        int[] res = {left, right};
        return res;
    }

    private static int leftBound2(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (nums[mid] < target) {
                head = mid + 1;
            } else if (nums[mid] > target) {
                tail = mid - 1;
            } else if (nums[mid] == target) {
                tail = mid - 1;
            }
        }
        if (head >= nums.length || nums[head] != target) {
            return -1;
        }
        return head;
    }

    private static int rightBound2(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (nums[mid] < target) {
                head = mid + 1;
            } else if (nums[mid] > target) {
                tail = mid - 1;
            } else if (nums[mid] == target) {
                head = mid + 1;
            }
        }
        if (tail < 0 || nums[tail] != target) {
            return -1;
        }
        return tail;
    }

    private static int leftBound(int[] nums, int target) {
        int head = 0;
        int tail = nums.length;
        while (head < tail) {
            int mid = head + (tail - head) / 2;
            if (nums[mid] < target) {
                head = mid + 1;
            } else if (nums[mid] > target) {
                tail = mid;
            } else if (nums[mid] == target) {
                tail = mid;
            }
        }
        if (tail >= nums.length) return -1;
        return nums[head] == target ? head : -1;
    }

    public static int rightBound(int[] nums, int target) {
        int head = 0;
        int tail = nums.length;
        while (head < tail) {
            int mid = head + (tail - head) / 2;
            if (nums[mid] < target) {
                head = mid + 1;
            } else if (nums[mid] > target) {
                tail = mid;
            } else if (nums[mid] == target) {
                head = mid + 1;
            }
        }
        if (tail == 0) return -1;
        return nums[tail - 1] == target ? (tail - 1) : -1;
    }

}
