package main.java;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

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
                new Random().ints(500, 10, 50).toArray()
        };

        for(int[] array : intArrays) {
            long start = System.nanoTime();
//            BubbleSort.sort(array);
//            SelectionSort.sort(array);
//            InsertionSort.sort(array);
//            ShellSort.sort(array);
//            MergeSort.sort(array);
//            QuickSort.sort(array);
//            StableCountingSort.sort(Arrays.stream(array).map(Math::abs).toArray());



            System.out.println("time taken: " + (System.nanoTime() - start));

        }
        int[] numbers = new Random().ints(1000, 0, 10000)
                .mapToObj(num -> String.format("%05d", num))
                .mapToInt(Integer::parseInt)
                .toArray();

        RadixSort.sort(numbers, 10, 4);
        System.out.println(Arrays.toString(numbers));
        System.out.println("is array sorted: " + isSorted(numbers, numbers.length));




    }
    static boolean isSorted(int[] array, int length) {
        if (array == null || length < 2)
            return true;
        if (array[length - 2] > array[length - 1])
            return false;
        return isSorted(array, length - 1);
    }
}
