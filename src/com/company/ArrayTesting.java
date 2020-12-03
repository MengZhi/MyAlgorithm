package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayTesting {
    public List<Integer> list = new ArrayList<>();

    public void arrayTesting() {
        initArrayList();
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for (Integer each: list) {
            System.out.println(each);
        }

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private void initArrayList() {
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
    }
}
