package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class ContentSensorTextTest {

    @Test
    public void testCompareTo() {
        ArrayList<ContentSensorText> contentList = new ArrayList<>();


        ContentSensorText c1 = new ContentSensorText("c1", Arrays.asList(1,1,2,2));
        ContentSensorText c2 = new ContentSensorText("c2", Arrays.asList(1,1,3));
        ContentSensorText c3 = new ContentSensorText("c3", Arrays.asList(1,1,4));
        ContentSensorText c4 = new ContentSensorText("c4", Arrays.asList(1,1,5,5));

        contentList.add(c4);
        contentList.add(c3);
        contentList.add(c2);
        contentList.add(c1);

        Collections.sort(contentList);

        for (ContentSensorText each : contentList) {
            System.out.println(each.pos);
        }
    }
}