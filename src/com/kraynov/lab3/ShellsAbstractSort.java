package com.kraynov.lab3;


public class ShellsAbstractSort extends InsertionSort {

    @Override
    public void doSort(long[] arr) {
//        int d = arr.length - 3* (Integer.highestOneBit(arr.length) >> 1);
//        int d1 = Integer.highestOneBit(arr.length); // closed low power of 2
//        d1 << 1
        for (int i=4; i<40; i++){
            int l = i - 3* (Integer.highestOneBit(i-1) >> 1);
            int result = l>0 ? Integer.highestOneBit(i-1) : Integer.highestOneBit(i-2);
            System.out.printf("%2d: %2d %2d\n", i, l, result);
        }


        int d = Integer.highestOneBit(arr.length-1) >> 1;
        //Integer.highestOneBit()
        while (d > 1){
            for (int i=0; i< (arr.length >> 1); i++){
                if (arr[i] > arr[i+d]) swap(arr, i, i+d);
            }
            d = d >> 1;
        }

        super.doSort(arr);
    }
}
