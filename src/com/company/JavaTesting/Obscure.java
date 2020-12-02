package com.company.JavaTesting;

import java.util.ArrayList;
import java.util.List;

public class Obscure {
    static String System;

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("a");
        strings.add("b");
        strings.add(1, "c");
    }
}
