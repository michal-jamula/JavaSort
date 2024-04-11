package main.java;

import java.util.Arrays;

/**
 * NOT an in-place algorithm (you create extra arrays)
 * O(nlogn - base 2) time complexity
 * Stable algorithm
 * How it works:
 *      Recursively divides the array in 2 until you get arrays of size 1
 *      Sorts and merges the arrays back up
 */
public class MergeSort {

    public static void sort(int[] numbers) {
        System.out.println("\nBefore Merge sort: " + Arrays.toString(numbers));
        MergeSort.sort(numbers, 0, numbers.length);
        System.out.println("After Merge sort: " + Arrays.toString(numbers));
    }

    public static void sort(int[] numbers, int start, int end) {
        if (end-start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        sort(numbers, start, mid);
        sort(numbers, mid, end);
        merge(numbers, start, mid, end);

    }

    private static void merge(int[] array, int start, int mid, int end) {

        if (array[mid - 1] <= array[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);

    }



}
