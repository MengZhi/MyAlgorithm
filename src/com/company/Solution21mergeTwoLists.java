package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution21mergeTwoLists {
    public Main.ListNode mergeTwoLists(Main.ListNode l1, Main.ListNode l2) {
        List<Integer> resList = new ArrayList<>();

        while (l1 != null) {
            resList.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            resList.add(l2.val);
            l2 = l2.next;
        }
        resList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        Main.ListNode res = new Main.ListNode(0);
        Main.ListNode hhead = res;
        for (int i=0; i<resList.size(); i++) {
            res.next = new Main.ListNode(resList.get(i));
            res = res.next;
        }
        return hhead.next;

    }
}
