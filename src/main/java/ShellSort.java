package main.java;

import java.util.Arrays;

/**
 * O(1) space complexity
 * O(n^2) time complexity (but usually performs better than that)
 * Unstable sort (the order of duplicates will NOT be preserved)
 * How it works:
 *      Calculates initial gap size by using the Knuth sequence
 *      Compares and swaps numbers that are seperated by that gap
 *      Reduces the gap and compares the numbers again
 *      With a final gap of 1, does the Insertion Sort on the whole array
 * Can be used to enhance both Insertion and Bubble sort to make them faster.
 */
public class ShellSort {

    public static void sort(int[] numbers) {
        System.out.println("\nBefore Shell Insertion sort: " + Arrays.toString(numbers));
        int length = numbers.length;

        int gap = 1;
        while (gap < length / 3) {
            gap = (3 * gap) + 1;
        }

        while (gap >= 1) {

            for (int i = gap; i < length; i++) {
                for (int j = i; j >= gap && numbers[j] < numbers[j-gap]; j -= gap) {
                    swap(numbers, j, j-gap);
                }
            }

            gap = gap / 3;
        }

        System.out.println("After Shell Insertion sort: " + Arrays.toString(numbers));

    }

    private static void swap(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

}
