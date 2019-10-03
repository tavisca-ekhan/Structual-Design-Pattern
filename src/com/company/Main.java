package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] arrayOfInts = new Integer[] {2, 7, 8, 10, 5};

        Adapter adapter = new Adapter(arrayOfInts);

        adapter.adapte();
    }
}
