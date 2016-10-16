package com.kraynov.lab3;

import java.util.Arrays;
import java.util.Calendar;

public abstract class AbstractSortAlgorithm {

    public static boolean detailedLogging = true;

    public void printArray(long[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.printf("%3d ", arr[i]);
        }
        System.out.println();
    }

    /**
     * Print source array, do sorting, print result array.
     * @param arr - array to be sorted
     * @return time (in millis) for which sorting was done
     */
    public long sort(long[] arr){
        long[] src = Arrays.copyOf(arr, arr.length);

        if (detailedLogging) printArray(src);

        long start = Calendar.getInstance().getTimeInMillis();
        src = doSort(src);
        long result = Calendar.getInstance().getTimeInMillis()-start;

        if (detailedLogging) printArray(src);
        System.out.printf("Time: %d\n\n", result);

        return result;
    }

    protected void swap(long[] arr, int i, int j){
        long r = arr[i]; arr[i] = arr[j]; arr[j] = r;
    }

    public abstract long[] doSort(long[] arr);

    /******************/


    public static long[] generateRandom(int n){
        long[] arr = new long[n];
        for (int i=0; i<n; i++){
            arr[i] = Math.round(1000* Math.random());
        }
        return arr;
    }

    public enum SortingAlgorithm{InsertionSort, MergeSort}

    public static AbstractSortAlgorithm getInstance(String name){
        if (SortingAlgorithm.InsertionSort.name().equalsIgnoreCase(name)) return new InsertionSort();
        if (SortingAlgorithm.MergeSort.name().equalsIgnoreCase(name)) return new MergeSort();
        return new InsertionSort();
    }
}
