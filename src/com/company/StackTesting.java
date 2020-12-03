package com.company;

import java.util.Stack;

public class StackTesting {
    private Stack<Integer> stack = new Stack<>();

    void testing() {
        init();
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    private void init() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    }
}
