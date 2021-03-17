package com.company;

public class OrderedFiller implements Filler {
    @Override
    public int[] fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    @Override
    public String toString() {
        return "OrderedFiller";
    }
}
