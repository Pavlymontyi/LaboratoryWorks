package com.kraynov.lab3;

public class Lab3 {

    public static void start(){
        long[] arr = AbstractSortAlgorithm.generateRandom(32);
        ShellsAbstractSort algorithm = new ShellsAbstractSort();
        algorithm.sort(arr);
    }
}
