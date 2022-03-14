package com.company.JavaTesting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Animal cat = new Cat();
//        animal.print();
//        cat.print();
//        Animal animal = new Cat();
//        System.out.println(animal.fun() + " " + ((Cat) animal).a);

        double v1 = 1.1;
        double v2 = 0.99;
        double v3 = -1.49;


        System.out.println((int)v1);
        System.out.println((int)v2);
        System.out.println((int)v3);


        Map<Key, String> myMap = new HashMap<>();
        Key key = new Key(1);

        myMap.put(key, "first");

        System.out.println(myMap.get(key));

        Key k2 = new Key(1);

        System.out.println(myMap.get(k2));

        key.value = 2;

        System.out.println(myMap.get(key));

    }

    public static class Key {
        int value;

        Key(int newValue) {
            value = newValue;
        }
    }
}
