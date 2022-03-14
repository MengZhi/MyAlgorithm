package com.company;

import java.util.ArrayList;
import java.util.List;

public class ContentSensorText implements Comparable<ContentSensorText> {
    String content;
    List<Integer> pos;

    ContentSensorText(String content, List<Integer> pos) {
        this.content = content;
        this.pos = pos;
    }

    @Override
    public int compareTo(ContentSensorText o) {
        System.out.println("current: pos: " + pos);
        System.out.println("other: pos: " + o.pos);

        if (pos.size() < 4) {
            return -1;
        } else if (o.pos.size() < 4) {
            return -1;
        } else {
            return pos.get(3) - o.pos.get(3);
        }
    }
}
