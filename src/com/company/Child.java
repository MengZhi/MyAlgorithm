package com.company;

public class Child extends Father {
    private Integer i;

    public Child() {
        i = 1;
        start();
    }

    @Override
    public void start() {
        System.out.println("child start.");
        //System.out.println(i.byteValue());
    }
}