package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxValueForLayers {

    List<Integer> maxValueForLayers(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        queue.offer(node);
        int size;
        while(!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            size = queue.size();
            for (int i=0; i<size; i++) {
                TreeNode qHead = queue.peek();
                max = Math.max(max, queue.peek().val);
                if (qHead.left != null) {
                    queue.offer(qHead.left);
                }
                if (qHead.right != null) {
                    queue.offer(qHead.right);
                }
                queue.poll();
            }
            result.add(max);
        }
        return result;
    }

    List<Integer> getMaxValueForLayers(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        que.offer(root);
        int size;
        while (!que.isEmpty()) {
            size = que.size();
            int max = -Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                if (node.val > max) max = node.val;
                if (node.left != null) que.offer(node.left);
                if (node.right != null) que.offer(node.right);
            }
            res.add(max);
        }
        return res;
    }
}
