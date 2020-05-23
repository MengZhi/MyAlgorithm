package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution15 {

    public void test() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {-2,0,1,1,2};
        System.out.print(review(nums2));
        //testing();
    }

    public List<List<Integer>> review(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int first;
        int last;
        for (int head = 0; head<nums.length-2; head++) {
            first = head+1;
            last = nums.length-1;
            if (nums[head] > 0) {
                break;
            }
            if (head>0 && nums[head] == nums[head-1]) {
                continue;
            }
            while (first < last) {
                int sum = nums[head] + nums[first] + nums[last];
                if (sum == 0) {
                    res.add(new ArrayList<>(Arrays.asList(nums[head], nums[first], nums[last])));
                    while (first < last && nums[first] == nums[++first]);
                    while (first < last && nums[last] == nums[--last]);
                } else if (sum < 0) {
                    while (first < last && nums[first] == nums[++first]);

                } else if (sum > 0) {
                    while (first < last && nums[last] == nums[--last]);
                }
            }
        }

        return res;
    }

    public void testing() {
        int i=0;
        int j=0;
        int a=0;
        int b=0;
        int[] array = {0,1,2,3,4};
        if (array[i] == array[i++]) {
            System.out.println("i");
        }
        if (array[j] == array[++j]) {
            System.out.println("j");
        }

        if (1 == (a++) ) {
            System.out.println("i="+i);
        }
        if(1 == (++b)) {
            System.out.println("j="+j);
        }


    }

    public List<List<Integer>> myThreeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int first;
        int last;
        for (int head = 0; head < nums.length - 2; head++) {
            first = head + 1;
            last = nums.length - 1;
            if (nums[head] > 0) {
                break;
            }
            if (head > 0 && nums[head] == nums[head - 1]) {
                continue;
            }
            while (first < last) {
                int sum = nums[head] + nums[first] + nums[last];
                if (sum < 0) {
//                    while(first < last && nums[first] == nums[++first]);
                    while (first < last && nums[first] == nums[first + 1]) {
                        first++;
                    }
                    first++;
                } else if (sum > 0) {
//                    while(first < last && nums[last] == nums[--last]);
                    while (first < last && nums[last] == nums[last - 1]) {
                        last--;
                    }
                    last--;
                } else if (sum == 0) {
                    res.add(new ArrayList<>(Arrays.asList(nums[head], nums[first], nums[last])));
//                    while(first < last && nums[first] == nums[++first]);
//                    while(first < last && nums[last] == nums[--last]);
                    while (first < last && nums[first] == nums[first + 1]) {
                        first++;
                    }
                    while (first < last && nums[last] == nums[last - 1]) {
                        last--;
                    }
                    last--;
                    first++;
                }
            }
        }
        return res;
    }


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) ;
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) ;
                } else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (i < j && nums[i] == nums[++i]) ;
                    while (i < j && nums[j] == nums[--j]) ;
                }
            }
        }
        return res;
    }
}
