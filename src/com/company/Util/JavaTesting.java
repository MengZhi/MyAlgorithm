package com.company.Util;

import java.util.*;

public class JavaTesting {
    public void treeMapTesting() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        treeMap.put(6,3);
        treeMap.put(1,4);
        treeMap.put(5,5);

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
