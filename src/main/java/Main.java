package main.java;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] intArrays = {
                {},
                {1,2,5,3,1,7,9,1,12,83,1,5,3,2},
                {1,2,-5,3,-1,7,9,1,12,83,-21,5,3,2},
                {1,1,1,1,1,1,1,2,1,1,1},
                {2,2,2,2},
                {1,2},
                {2,1},
                new Random().ints(50000000).toArray()
        };

        for(int[] array : intArrays) {
            long start = System.nanoTime();
//            BubbleSort.sort(array);
//            SelectionSort.sort(array);
//            InsertionSort.sort(array);
//            ShellSort.sort(array);
//            MergeSort.sort(array);
            QuickSort.sort(array);


            System.out.println("time taken: " + (System.nanoTime() - start));

        }

    }
}
