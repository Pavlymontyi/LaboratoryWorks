package com.kraynov.lab3;

public class Lab3 {

    public static void start(){

        long[] arr = AbstractSortAlgorithm.generateRandom(40000);
        AbstractSortAlgorithm algorithm = new InsertionSort();
        algorithm.sort(arr);
    }

    public static void testPerformance(int N){
        long[][] testData = new long[N][];
        long[] times = new long[N];
        for (int i=0; i<N; i++){
            testData[i] = AbstractSortAlgorithm.generateRandom(10000);
        }

        AbstractSortAlgorithm algorithm;
        for (AbstractSortAlgorithm.SortingAlgorithm al : AbstractSortAlgorithm.SortingAlgorithm.values()){
            algorithm = AbstractSortAlgorithm.getInstance(al.name());
            for (int i=0; i<N; i++) {
                times[i] = algorithm.sort(testData[i]);
            }
        }
    }

}
