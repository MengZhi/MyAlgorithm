package com.huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeArrayHas implements Solution{

    @Override
    public void getResult() {
        int[] first = {1,2,3,4,5};
        int[] second = {1,2,5,7,9};
        int[] third = {1,3,4,5,8};
        System.out.println(threeArrayHas(first, second, third));
    }

    public List<Integer> threeArrayHas(int[] first, int[] second, int[] third) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i=0; i<first.length; i++) {
            if (temp.containsKey(first[i])) {
                continue;
            } else {
                temp.put(first[i], 1);
            }
        }

        for (int i=0; i<second.length; i++) {
            if (temp.containsKey(second[i])) {
                temp.put(second[i], temp.get(second[i])+1);
            } else {
                temp.put(second[i], 1);
            }
        }

        for (int i=0; i<third.length; i++) {
            if (temp.containsKey(third[i])) {
                temp.put(third[i], temp.get(third[i])+1);
            } else {
                temp.put(third[i], 1);
            }
        }

        for (Integer i: temp.keySet()) {
            Integer count = temp.get(i);
            if (count == 3) {
                result.add(i);
            }
        }

        return result;
    }
}
