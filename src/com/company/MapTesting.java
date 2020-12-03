package com.company;

import java.util.*;

public class MapTesting {
    public NavigableMap<Integer, Integer> navigableMap = new TreeMap<>();
    public HashMap<Integer, Integer> hashMap = new HashMap<>();

    public void mapTesting() {
        initMap();


        //方法一：在for循环中使用entries实现Map的遍历：
        for (NavigableMap.Entry<Integer, Integer> entry : navigableMap.entrySet()) {
            System.out.println("Key: "+ entry.getKey() + "Value: " + entry.getValue());
        }

        //方法三：通过Iterator遍历；
        Iterator<Map.Entry<Integer, Integer>> entries = navigableMap.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }


        //方法四：通过键找值遍历，这种方式的效率比较低，因为本身从键取值是耗时的操作；
        //key
        for(Integer key : navigableMap.keySet()){
            System.out.println(key + "->" + navigableMap.get(key));
        }

        //方法二：在for循环中遍历key或者values，一般适用于只需要map中的key或者value时使用，在性能上比使用entrySet较好；
        //value
        for(Integer value : navigableMap.values()){
            System.out.println(value);
        }

    }

    private void initMap() {
        navigableMap.put(2, 2);
        navigableMap.put(1, 1);
        navigableMap.put(5, 5);
        navigableMap.put(3, 3);
    }
}
