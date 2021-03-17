package com.company;

public class ShellSorter implements Sorter{
    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = array[i];
                
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];

                array[j] = temp;
            }
        }
    }

    @Override
    public String toString() {
        return "ShellSorter ";
    }
}
