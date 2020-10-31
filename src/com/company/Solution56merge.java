package com.company;

import java.util.*;

public class Solution56merge {
    public class Comparator implements java.util.Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0] - o2[0];
        }
    }

    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if (len < 1) return intervals;

        Arrays.sort(intervals, new Comparator());
        List<int[]> list = new ArrayList<>(len);
        for (int i = 0; i < len - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = Math.max(intervals[i + 1][1], intervals[i][1]);
            } else list.add(intervals[i]);
        }
        list.add(intervals[len - 1]); // 别忘了最后一个


        return list.toArray(new int[list.size()][2]);
    }
}
