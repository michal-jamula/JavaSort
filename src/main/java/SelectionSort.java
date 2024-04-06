package main.java;

import java.util.Arrays;

/**
 Selection sort
 Time complexity: O(n^2)
 Space complexity: O(1)
 This is an unstable sort (the order of duplicates will NOT be preserved)
 Usually performs better than Bubble sort because it does fewer swaps
 */
public class SelectionSort {


    public static void sort (int[] numbers) {
        System.out.println("\nBefore selection sort: " + Arrays.toString(numbers));

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (numbers[i] > numbers[largestIndex])
                        largestIndex = i;
            }

            swap(numbers, largestIndex, lastUnsortedIndex);
        }
        System.out.println("After selection sort: " + Arrays.toString(numbers));
    }

    private static void swap (int[] array, int i, int j) {
        if (i == j)
            return;

        int temp = array [i];
        array[i] = array[j];
        array[j] = temp;
    }
}
