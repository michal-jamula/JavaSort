package main.java;

import java.util.Arrays;

/**
 * O(n^2) time complexity
 * O(1) space complexity
 * Stable sort (the order of duplicates will be preserved)
 * How it works:
 *      Partitions the array into a sorted and unsorted partitions
 *      Marks the first element as sorted
 *      Grows the sorted partition by moving the new element into it
 *      Sorted partition makes room for the new element by moving all greater numbers up
 * Generally performs better than bubble sort because it makes fewer comparisons and swaps on average
 * The efficiency of this sort also increases if the array is partially sorted
 */
public class InsertionSort {

    public static void sort (int[] numbers) {
        System.out.println("\nBefore Insertion sort: " + Arrays.toString(numbers));

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {
            int comparedNumber = numbers[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && numbers[i-1] > comparedNumber; i--) {
                numbers[i] = numbers[i-1];
            }

            numbers[i] = comparedNumber;
        }

        System.out.println("After Insertion sort: " + Arrays.toString(numbers));
    }
}
