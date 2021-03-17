package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[1_000];
        int[] array2 = new int[10_000];
        int[] array3 = new int[100_000];
        int[] array4 = new int[100_000_000];
/*
		DataProcessor dp = new DataProcessor(new BubleSorter(),new RandomFiller());
        System.out.println(dp.processData(array1, array2, array3));

		DataProcessor dp1 = new DataProcessor(new InsertionSorter(),new RandomFiller());
		System.out.println(dp1.processData(array1.clone(), array2.clone(), array3.clone()));

		DataProcessor dp2 = new DataProcessor(new SelectionSorter(),new RandomFiller());
		System.out.println(dp2.processData(array1.clone(), array2.clone(), array3.clone()));

		DataProcessor dp3 = new DataProcessor(new BubleSorter(),new OrderedFiller());
		System.out.println(dp3.processData(array1.clone(), array2.clone(), array3.clone()));

		DataProcessor dp4 = new DataProcessor(new InsertionSorter(),new OrderedFiller());
		System.out.println(dp4.processData(array1.clone(), array2.clone(), array3.clone()));

		DataProcessor dp5 = new DataProcessor(new SelectionSorter(),new OrderedFiller());
		System.out.println(dp5.processData(array1.clone(), array2.clone(), array3.clone()));
*/

        DataProcessor dp = new DataProcessor(new QuickSorter(), new RandomFiller());
        System.out.println(dp.processData(array3, array4));

        DataProcessor dp2 = new DataProcessor(new ShellSorter(), new RandomFiller());
        System.out.println(dp2.processData(array3, array4));

        DataProcessor dp3 = new DataProcessor(new MergeSorter(), new RandomFiller());
        System.out.println(dp3.processData(array3, array4));

        DataProcessor dp4 = new DataProcessor(new HeapSorter(), new RandomFiller());
        System.out.println(dp4.processData(array3, array4));

        DataProcessor dp5 = new DataProcessor(new QuickSorter(), new OrderedFiller());
        System.out.println(dp5.processData(array3.clone(), array4.clone()));

        DataProcessor dp6 = new DataProcessor(new ShellSorter(), new OrderedFiller());
        System.out.println(dp6.processData(array3.clone(), array4.clone()));

        DataProcessor dp7 = new DataProcessor(new MergeSorter(), new OrderedFiller());
        System.out.println(dp7.processData(array3, array4));

        DataProcessor dp8 = new DataProcessor(new HeapSorter(), new OrderedFiller());
        System.out.println(dp8.processData(array3, array4));
    }
}
