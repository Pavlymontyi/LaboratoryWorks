package com.kraynov.lab3;

public class InsertionSort extends AbstractSortAlgorithm {


    public long[] doSort(long[] arr){
        System.out.println("InsertionSort start");
        for (int i=1; i<arr.length; i++){
            for (int j=0; j<i; j++){
                if (arr[i] < arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

}
