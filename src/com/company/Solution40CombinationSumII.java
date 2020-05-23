/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 *
 * The same repeated number may be chosen from candidates unlimited number of times.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 *
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * Example 2:
 *
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution40CombinationSumII {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> solution = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(candidates);
        DFS(candidates, target, 0, solution, result);
        return result;
    }

    private static void DFS(int[] candidates, int target, int start, List<Integer> solution, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(solution));
        } else {
            int pre = -1;
            for (int i= start; i<candidates.length; i++) {
                if (pre == candidates[i]) continue;
                if (candidates[i] > target) return;
                pre = candidates[i];
                solution.add(candidates[i]);
                DFS(candidates, target-candidates[i], i+1, solution, result);
                solution.remove(solution.size()-1);
            }
        }
    }
}


















