package com.company;

public class BinarySearch {

    public static int searchNumber(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (nums[mid] < target) {
                head = mid + 1;
            } else if (nums[mid] > target) {
                tail = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    public static int leftBound(int[] nums, int target) {
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

        // target 比所有数都大
        if (head == nums.length) return -1;
        // 类似之前算法的处理方式
        return nums[head] == target ? head : -1;
    }

    public static int leftBound2(int[] nums, int target) {
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
        if (head >= nums.length || nums[head] != target) return -1;
        return head;
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

    public static int rightBound2(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (nums[mid] < target) {
                head = mid + 1;
            } else if (nums[mid] > target) {
                tail = mid - 1;
            } else if (nums[mid] == target) {
                head = mid +1;
            }
        }
        if (tail < 0 || nums[tail] != target)
            return -1;
        return tail;
    }
}
