/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * <p>
 * Example:
 * <p>
 * Input: n = 4, k = 2
 * Output:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combinations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution77Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> solution = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();

        DFS(result, solution, 1, n, k);

        return result;
    }

    private static void DFS(List<List<Integer>> result, List<Integer> solution, int index, int n, int k) {
        if (solution.size() == k) {
            result.add(new ArrayList<>(solution));
        } else {
            for (int i = index; i <= n; i++) {
                solution.add(i);
                DFS(result, solution, i + 1, n, k);
                solution.remove(solution.size() - 1);
            }
        }
    }
}


















