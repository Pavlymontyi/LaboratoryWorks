package com.kraynov.lab3;

import java.util.Calendar;

public abstract class AbstractSortAlgorithm {

    protected boolean detailedLogging = true;

    public void printArray(long[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.printf("%3d ", arr[i]);
        }
        System.out.println();
    }

    public void sort(long[] arr){
        printArray(arr);

        long start = Calendar.getInstance().getTimeInMillis();
        doSort(arr);
        System.out.printf("Time: %d\n", Calendar.getInstance().getTimeInMillis()-start);

        printArray(arr);
        System.out.println();
    }

    public static long[] generateRandom(int n){
        long[] arr = new long[n];
        for (int i=0; i<n; i++){
            arr[i] = Math.round(1000* Math.random());
        }
        return arr;
    }

    protected void swap(long[] arr, int i, int j){
        long r = arr[i]; arr[i] = arr[j]; arr[j] = r;
    }

    public abstract void doSort(long[] arr);
}
