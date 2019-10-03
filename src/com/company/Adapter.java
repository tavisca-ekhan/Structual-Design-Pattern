package com.company;

import java.util.Arrays;
import java.util.List;

public class Adapter {
    private final Integer[] arrayOfInts;
    private final List<Integer> listOfInts;

    public Adapter(Integer[] arrayOfInts) {
        this.arrayOfInts = arrayOfInts;
        listOfInts = Arrays.asList(arrayOfInts);
    }

    public void adapte() {
        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }
}
