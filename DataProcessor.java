package com.company;

import java.util.ArrayList;

public class DataProcessor {
    private Sorter sorter;
    private Filler filler;

    public DataProcessor(Sorter sorter, Filler filler) {
        this.sorter = sorter;
        this.filler = filler;
    }

    public ArrayList<String> processData(int[] array1, int[] array2, int[] array3) {
        String sorterAndFiller = sorter.toString()+filler.toString();
        ArrayList<String> sortingSpeed = new ArrayList<>();
        sortingSpeed.add(sorterAndFiller);
        sortingSpeed.add(timing(array1)+"ns");
        sortingSpeed.add(timing(array2)+"ns");
        sortingSpeed.add(timing(array3)+"ns");
        return sortingSpeed;
    }

    public ArrayList<String> processData(int[] array1, int[] array2){
        String sorterAndFiller = sorter.toString()+filler.toString();
        ArrayList<String> sortingSpeed = new ArrayList<>();
        sortingSpeed.add(sorterAndFiller);
        sortingSpeed.add(timing(array1)+"ns");
        sortingSpeed.add(timing(array2)+"ns");
        return sortingSpeed;
    }

    public String timing(int[] array){
        filler.fill(array);
        long before = System.nanoTime();
        sorter.sort(array);
        long after = System.nanoTime();
        return Long.toString(after-before);
    }


}
