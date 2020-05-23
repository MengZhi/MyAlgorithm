/**
 * 47. Permutations II
 *
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 *
 * Example:
 *
 * Input: [1,1,2]
 * Output:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package com.company;

import java.util.*;

public class Solution47 {
    private static int n;

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        n = nums.length;

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int each : nums) {
            if (numsMap.containsKey(each)) {
                numsMap.put(each, numsMap.get(each)+1);
            } else {
                numsMap.put(each, 1);
            }
        }

        DFS(numsMap, result, new ArrayList<>());

        return result;

    }

    private static void DFS(Map<Integer, Integer> numsMap, List<List<Integer>> result, List<Integer> temp) {
        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
        }
        for(Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() <= 0) {
                continue;
            }
            entry.setValue(entry.getValue()-1);
            temp.add(entry.getKey());
            DFS(numsMap, result, temp);
            temp.remove(temp.size()-1);
            entry.setValue(entry.getValue()+1);
        }
    }
}
