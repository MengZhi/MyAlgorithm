/**
 * Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
 * <p>
 * Note:
 * <p>
 * All numbers will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 * <p>
 * Input: k = 3, n = 7
 * Output: [[1,2,4]]
 * Example 2:
 * <p>
 * Input: k = 3, n = 9
 * Output: [[1,2,6], [1,3,5], [2,3,4]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution216CombinationSumIII {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        DFS(temp, result, k, n, 1);
        return result;
    }

    private static void DFS(List<Integer> solution, List<List<Integer>> result, int k, int target, int start) {
        if (target == 0 && solution.size() == k) {
            result.add(new ArrayList<>(solution));
        } else {
            for (int i = start; i < 10; i++) {
                if (i > target) return;
                solution.add(i);
                DFS(solution, result, k, target - i, i + 1);
                solution.remove(solution.size() - 1);
            }
        }
    }
}


















