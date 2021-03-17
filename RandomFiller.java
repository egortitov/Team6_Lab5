package com.company;

import java.util.Random;

public class RandomFiller implements Filler {
    @Override
    public int[] fill(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    @Override
    public String toString() {
        return "RandomFiller";
    }
}
