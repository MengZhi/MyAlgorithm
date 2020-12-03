package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTesting {
    private Queue<Integer> queue = new LinkedList<Integer>();

    void testing() {
        init();
        for (Integer each: queue) {
            System.out.print(each +",");
        }
        System.out.println();

        System.out.println(queue.poll());
        System.out.println("queue size: "+ queue.size());
        System.out.println(queue.peek());
        System.out.println("queue size: "+ queue.size());
    }

    void init() {
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
    }
}
