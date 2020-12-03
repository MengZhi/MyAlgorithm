package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n > 0) {
            DFS(result, "", 0, 0, n);
        }
        return result;
    }

    private void DFS(List<String> res, String temp, int left, int right, int n) {
        if (left == n && right == n) {
            res.add(temp);
        }
        if (left < n) {
            DFS(res, temp+"(", left+1, right, n);
        }
        if (right < left) {
            DFS(res, temp+")", left, right+1, n);
        }
    }
}
