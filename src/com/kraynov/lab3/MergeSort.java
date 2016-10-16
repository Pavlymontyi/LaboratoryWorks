package com.kraynov.lab3;

public class MergeSort extends AbstractSortAlgorithm{

    @Override
    public long[] doSort(long[] arr) {
        System.out.println("MergeSort start");
        return devideAndMerge(arr, 0, arr.length-1);
    }

    private long[] devideAndMerge(long[] arr, int left, int right) {
        if (left == right){
            long[] res = new long[1];
            res[0] = arr[left];
            return res;
        } else {
            int middle = (right - left) / 2;
            long[] larr = devideAndMerge(arr, left, left + middle);
            long[] rarr = devideAndMerge(arr, left + middle + 1, right);

            int rightCounter = 0, leftCounter = 0;
            long[] result = new long[larr.length + rarr.length];
            int i=0;
            while(i<result.length){
                if (rightCounter >= rarr.length) {
                    result[i] = larr[leftCounter++];
                } else if (leftCounter >= larr.length){
                    result[i] = rarr[rightCounter++];
                } else {
                    if (larr[leftCounter] < rarr[rightCounter]){
                        result[i] = larr[leftCounter++];
                    } else {
                        result[i] = rarr[rightCounter++];
                    }
                }
                i++;
            }
            return result;
        }
    }




}
