package com.company;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetTesting {
    private NavigableSet<Integer> set = new TreeSet<>();

    void testing() {
        init();
        for (Integer each: set) {
            System.out.println(each + ",");
        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ",");
        }
    }

    private void init() {
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(6);
        set.add(7);
    }
}
