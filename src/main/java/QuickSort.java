package main.java;

import java.util.Arrays;

/**
 * In-place algorithm
 * O(nlogn - base 2) time complexity - most of the time performs better than merge sort, worse case is O(n^2)
 * Unstable algorithm
 * How it works:
 *      Chooses a pivot element, partitions the array into 2
 *      On the left side it puts all elements which are less than pivot
 *      All greater elements go to the right
 *      Does this recursively until the arrays are a size of 1. Then its sorted
 */
public class QuickSort {

    public static void sort(int[] numbers) {
        System.out.println("\nBefore Quick sort: " + Arrays.toString(numbers));
        QuickSort.sort(numbers, 0, numbers.length);
        System.out.println("After Quick sort: " + Arrays.toString(numbers));
    }

    public static void sort(int[] numbers, int start, int end) {
        if (end - start < 2)
            return;

        int pivotIndex = partition(numbers, start, end);
        sort(numbers, start, pivotIndex);
        sort(numbers, pivotIndex + 1, end);

    }
    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {
            //decrement j until j is less than the pivot, or j crosses i
            while ( i < j && array[--j] >= pivot);
            if (i < j) {
                array[i] = array[j];
            }

            while (i < j && array[++i] <= pivot);
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }

}
