package com.company;

import java.util.ArrayList;
import java.util.Locale;

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
        sortingSpeed.add(timing(array1)+"ms");
        sortingSpeed.add(timing(array2)+"ms");
        sortingSpeed.add(timing(array3)+"ms");
        return sortingSpeed;
    }

    public ArrayList<String> processData(int[] array1, int[] array2){
        String sorterAndFiller = sorter.toString()+filler.toString();
        ArrayList<String> sortingSpeed = new ArrayList<>();
        sortingSpeed.add(sorterAndFiller);
        sortingSpeed.add(timing(array1)+"ms");
        sortingSpeed.add(timing(array2)+"ms");
        return sortingSpeed;
    }

    public String timing(int[] array){
        filler.fill(array);
        long before = System.currentTimeMillis();
        sorter.sort(array);
        long after = System.currentTimeMillis();
        String result = String.format(Locale.CANADA_FRENCH, "%,d", (after-before));
        return result;
    }


}
